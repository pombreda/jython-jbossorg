package org.thobe.compiler.sea;

import java.util.List;

class PhiNode extends ValueNode {
    PhiNode(Value[] values) {
        // TODO Auto-generated constructor stub
    }

    private List<Node> components;
    private final Value result = new Value(this) {
    };

    @Override
    public Value result() {
        return result;
    }

    @Override
    Node accept(GraphTraverser traverser) {
        return traverser.phi(this,
                components.toArray(new Node[components.size()])).traverse(
                traverser);
    }

    private StringBuilder parts() {
        StringBuilder parts = new StringBuilder();
        String sep = "";
        for (Node part : components) {
            parts.append(sep);
            parts.append(part);
            sep = ", ";
        }
        return parts;
    }

    @Override
    public String toString() {
        return "PhiNode[" + parts() + "]";
    }
}
