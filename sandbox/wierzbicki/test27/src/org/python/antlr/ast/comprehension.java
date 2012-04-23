// Autogenerated AST node
package org.python.antlr.ast;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.python.antlr.AST;
import org.python.antlr.PythonTree;
import org.python.antlr.adapter.AstAdapters;
import org.python.antlr.base.excepthandler;
import org.python.antlr.base.expr;
import org.python.antlr.base.mod;
import org.python.antlr.base.slice;
import org.python.antlr.base.stmt;
import org.python.core.ArgParser;
import org.python.core.AstList;
import org.python.core.Py;
import org.python.core.PyObject;
import org.python.core.PyString;
import org.python.core.PyType;
import org.python.expose.ExposedGet;
import org.python.expose.ExposedMethod;
import org.python.expose.ExposedNew;
import org.python.expose.ExposedSet;
import org.python.expose.ExposedType;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

@ExposedType(name = "_ast.comprehension", base = AST.class)
public class comprehension extends PythonTree {
    public static final PyType TYPE = PyType.fromClass(comprehension.class);
    private expr target;
    public expr getInternalTarget() {
        return target;
    }
    @ExposedGet(name = "target")
    public PyObject getTarget() {
        return target;
    }
    @ExposedSet(name = "target")
    public void setTarget(PyObject target) {
        this.target = AstAdapters.py2expr(target);
    }

    private expr iter;
    public expr getInternalIter() {
        return iter;
    }
    @ExposedGet(name = "iter")
    public PyObject getIter() {
        return iter;
    }
    @ExposedSet(name = "iter")
    public void setIter(PyObject iter) {
        this.iter = AstAdapters.py2expr(iter);
    }

    private java.util.List<expr> ifs;
    public java.util.List<expr> getInternalIfs() {
        return ifs;
    }
    @ExposedGet(name = "ifs")
    public PyObject getIfs() {
        return new AstList(ifs, AstAdapters.exprAdapter);
    }
    @ExposedSet(name = "ifs")
    public void setIfs(PyObject ifs) {
        this.ifs = AstAdapters.py2exprList(ifs);
    }


    private final static PyString[] fields =
    new PyString[] {new PyString("target"), new PyString("iter"), new PyString("ifs")};
    @ExposedGet(name = "_fields")
    public PyString[] get_fields() { return fields; }

    private final static PyString[] attributes = new PyString[0];
    @ExposedGet(name = "_attributes")
    public PyString[] get_attributes() { return attributes; }

    public comprehension(PyType subType) {
        super(subType);
    }
    public comprehension() {
        this(TYPE);
    }
    @ExposedNew
    @ExposedMethod
    public void comprehension___init__(PyObject[] args, String[] keywords) {
        ArgParser ap = new ArgParser("comprehension", args, keywords, new String[]
            {"target", "iter", "ifs"}, 3);
        setTarget(ap.getPyObject(0));
        setIter(ap.getPyObject(1));
        setIfs(ap.getPyObject(2));
    }

    public comprehension(PyObject target, PyObject iter, PyObject ifs) {
        setTarget(target);
        setIter(iter);
        setIfs(ifs);
    }

    public comprehension(Token token, expr target, expr iter, java.util.List<expr> ifs) {
        super(token);
        this.target = target;
        addChild(target);
        this.iter = iter;
        addChild(iter);
        this.ifs = ifs;
        if (ifs == null) {
            this.ifs = new ArrayList<expr>();
        }
        for(PythonTree t : this.ifs) {
            addChild(t);
        }
    }

    public comprehension(Integer ttype, Token token, expr target, expr iter, java.util.List<expr>
    ifs) {
        super(ttype, token);
        this.target = target;
        addChild(target);
        this.iter = iter;
        addChild(iter);
        this.ifs = ifs;
        if (ifs == null) {
            this.ifs = new ArrayList<expr>();
        }
        for(PythonTree t : this.ifs) {
            addChild(t);
        }
    }

    public comprehension(PythonTree tree, expr target, expr iter, java.util.List<expr> ifs) {
        super(tree);
        this.target = target;
        addChild(target);
        this.iter = iter;
        addChild(iter);
        this.ifs = ifs;
        if (ifs == null) {
            this.ifs = new ArrayList<expr>();
        }
        for(PythonTree t : this.ifs) {
            addChild(t);
        }
    }

    @ExposedGet(name = "repr")
    public String toString() {
        return "comprehension";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("comprehension(");
        sb.append("target=");
        sb.append(dumpThis(target));
        sb.append(",");
        sb.append("iter=");
        sb.append(dumpThis(iter));
        sb.append(",");
        sb.append("ifs=");
        sb.append(dumpThis(ifs));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        traverse(visitor);
        return null;
    }

    public void traverse(VisitorIF<?> visitor) throws Exception {
        if (target != null)
            target.accept(visitor);
        if (iter != null)
            iter.accept(visitor);
        if (ifs != null) {
            for (PythonTree t : ifs) {
                if (t != null)
                    t.accept(visitor);
            }
        }
    }

}