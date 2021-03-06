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

@ExposedType(name = "_ast.For", base = AST.class)
public class For extends stmt {
public static final PyType TYPE = PyType.fromClass(For.class);
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

    private java.util.List<stmt> body;
    public java.util.List<stmt> getInternalBody() {
        return body;
    }
    @ExposedGet(name = "body")
    public PyObject getBody() {
        return new AstList(body, AstAdapters.stmtAdapter);
    }
    @ExposedSet(name = "body")
    public void setBody(PyObject body) {
        this.body = AstAdapters.py2stmtList(body);
    }

    private java.util.List<stmt> orelse;
    public java.util.List<stmt> getInternalOrelse() {
        return orelse;
    }
    @ExposedGet(name = "orelse")
    public PyObject getOrelse() {
        return new AstList(orelse, AstAdapters.stmtAdapter);
    }
    @ExposedSet(name = "orelse")
    public void setOrelse(PyObject orelse) {
        this.orelse = AstAdapters.py2stmtList(orelse);
    }


    private final static PyString[] fields =
    new PyString[] {new PyString("target"), new PyString("iter"), new PyString("body"), new
                     PyString("orelse")};
    @ExposedGet(name = "_fields")
    public PyString[] get_fields() { return fields; }

    private final static PyString[] attributes =
    new PyString[] {new PyString("lineno"), new PyString("col_offset")};
    @ExposedGet(name = "_attributes")
    public PyString[] get_attributes() { return attributes; }

    public For(PyType subType) {
        super(subType);
    }
    public For() {
        this(TYPE);
    }
    @ExposedNew
    @ExposedMethod
    public void For___init__(PyObject[] args, String[] keywords) {
        ArgParser ap = new ArgParser("For", args, keywords, new String[]
            {"target", "iter", "body", "orelse", "lineno", "col_offset"}, 4);
        setTarget(ap.getPyObject(0));
        setIter(ap.getPyObject(1));
        setBody(ap.getPyObject(2));
        setOrelse(ap.getPyObject(3));
        int lin = ap.getInt(4, -1);
        if (lin != -1) {
            setLineno(lin);
        }

        int col = ap.getInt(5, -1);
        if (col != -1) {
            setLineno(col);
        }

    }

    public For(PyObject target, PyObject iter, PyObject body, PyObject orelse) {
        setTarget(target);
        setIter(iter);
        setBody(body);
        setOrelse(orelse);
    }

    public For(Token token, expr target, expr iter, java.util.List<stmt> body, java.util.List<stmt>
    orelse) {
        super(token);
        this.target = target;
        addChild(target);
        this.iter = iter;
        addChild(iter);
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmt>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
        this.orelse = orelse;
        if (orelse == null) {
            this.orelse = new ArrayList<stmt>();
        }
        for(PythonTree t : this.orelse) {
            addChild(t);
        }
    }

    public For(Integer ttype, Token token, expr target, expr iter, java.util.List<stmt> body,
    java.util.List<stmt> orelse) {
        super(ttype, token);
        this.target = target;
        addChild(target);
        this.iter = iter;
        addChild(iter);
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmt>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
        this.orelse = orelse;
        if (orelse == null) {
            this.orelse = new ArrayList<stmt>();
        }
        for(PythonTree t : this.orelse) {
            addChild(t);
        }
    }

    public For(PythonTree tree, expr target, expr iter, java.util.List<stmt> body,
    java.util.List<stmt> orelse) {
        super(tree);
        this.target = target;
        addChild(target);
        this.iter = iter;
        addChild(iter);
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmt>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
        this.orelse = orelse;
        if (orelse == null) {
            this.orelse = new ArrayList<stmt>();
        }
        for(PythonTree t : this.orelse) {
            addChild(t);
        }
    }

    @ExposedGet(name = "repr")
    public String toString() {
        return "For";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("For(");
        sb.append("target=");
        sb.append(dumpThis(target));
        sb.append(",");
        sb.append("iter=");
        sb.append(dumpThis(iter));
        sb.append(",");
        sb.append("body=");
        sb.append(dumpThis(body));
        sb.append(",");
        sb.append("orelse=");
        sb.append(dumpThis(orelse));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitFor(this);
    }

    public void traverse(VisitorIF<?> visitor) throws Exception {
        if (target != null)
            target.accept(visitor);
        if (iter != null)
            iter.accept(visitor);
        if (body != null) {
            for (PythonTree t : body) {
                if (t != null)
                    t.accept(visitor);
            }
        }
        if (orelse != null) {
            for (PythonTree t : orelse) {
                if (t != null)
                    t.accept(visitor);
            }
        }
    }

    private int lineno = -1;
    @ExposedGet(name = "lineno")
    public int getLineno() {
        if (lineno != -1) {
            return lineno;
        }
        return getLine();
    }

    @ExposedSet(name = "lineno")
    public void setLineno(int num) {
        lineno = num;
    }

    private int col_offset = -1;
    @ExposedGet(name = "col_offset")
    public int getCol_offset() {
        if (col_offset != -1) {
            return col_offset;
        }
        return getCharPositionInLine();
    }

    @ExposedSet(name = "col_offset")
    public void setCol_offset(int num) {
        col_offset = num;
    }

}
