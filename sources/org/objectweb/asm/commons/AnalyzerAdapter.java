package org.objectweb.asm.commons;

import B0.C0922f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

/* JADX INFO: loaded from: classes8.dex */
public class AnalyzerAdapter extends MethodVisitor {
    private List<Label> labels;
    public List<Object> locals;
    private int maxLocals;
    private int maxStack;
    private String owner;
    public List<Object> stack;
    public Map<Object, Object> uninitializedTypes;

    public AnalyzerAdapter(String str, int i10, String str2, String str3, MethodVisitor methodVisitor) {
        this(589824, str, i10, str2, str3, methodVisitor);
        if (getClass() != AnalyzerAdapter.class) {
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void execute(int r6, int r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 1074
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.commons.AnalyzerAdapter.execute(int, int, java.lang.String):void");
    }

    private Object get(int i10) {
        this.maxLocals = Math.max(this.maxLocals, i10 + 1);
        return i10 < this.locals.size() ? this.locals.get(i10) : Opcodes.TOP;
    }

    private Object pop() {
        return this.stack.remove(r0.size() - 1);
    }

    private void push(Object obj) {
        this.stack.add(obj);
        this.maxStack = Math.max(this.maxStack, this.stack.size());
    }

    private void pushDescriptor(String str) {
        if (str.charAt(0) == '(') {
            str = Type.getReturnType(str).getDescriptor();
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'F') {
            push(Opcodes.FLOAT);
            return;
        }
        if (cCharAt == 'L') {
            push(C0922f.a(str, 1, 1));
            return;
        }
        if (cCharAt != 'S') {
            if (cCharAt == 'V') {
                return;
            }
            if (cCharAt != 'I') {
                if (cCharAt == 'J') {
                    push(Opcodes.LONG);
                    push(Opcodes.TOP);
                    return;
                } else if (cCharAt != 'Z') {
                    if (cCharAt == '[') {
                        push(str);
                        return;
                    }
                    switch (cCharAt) {
                        case 'B':
                        case 'C':
                            break;
                        case 'D':
                            push(Opcodes.DOUBLE);
                            push(Opcodes.TOP);
                            return;
                        default:
                            throw new AssertionError();
                    }
                }
            }
        }
        push(Opcodes.INTEGER);
    }

    private void set(int i10, Object obj) {
        this.maxLocals = Math.max(this.maxLocals, i10 + 1);
        while (i10 >= this.locals.size()) {
            this.locals.add(Opcodes.TOP);
        }
        this.locals.set(i10, obj);
    }

    private static void visitFrameTypes(int i10, Object[] objArr, List<Object> list) {
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            list.add(obj);
            if (obj == Opcodes.LONG || obj == Opcodes.DOUBLE) {
                list.add(Opcodes.TOP);
            }
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i10, String str, String str2, String str3) {
        super.visitFieldInsn(i10, str, str2, str3);
        execute(i10, 0, str3);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int i10, int i11, Object[] objArr, int i12, Object[] objArr2) {
        if (i10 != -1) {
            throw new IllegalArgumentException("AnalyzerAdapter only accepts expanded frames (see ClassReader.EXPAND_FRAMES)");
        }
        super.visitFrame(i10, i11, objArr, i12, objArr2);
        List<Object> list = this.locals;
        if (list != null) {
            list.clear();
            this.stack.clear();
        } else {
            this.locals = new ArrayList();
            this.stack = new ArrayList();
        }
        visitFrameTypes(i11, objArr, this.locals);
        visitFrameTypes(i12, objArr2, this.stack);
        this.maxLocals = Math.max(this.maxLocals, this.locals.size());
        this.maxStack = Math.max(this.maxStack, this.stack.size());
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i10, int i11) {
        super.visitIincInsn(i10, i11);
        this.maxLocals = Math.max(this.maxLocals, i10 + 1);
        execute(132, i10, null);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i10) {
        super.visitInsn(i10);
        execute(i10, 0, null);
        if ((i10 < 172 || i10 > 177) && i10 != 191) {
            return;
        }
        this.locals = null;
        this.stack = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i10, int i11) {
        super.visitIntInsn(i10, i11);
        execute(i10, i11, null);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        super.visitInvokeDynamicInsn(str, str2, handle, objArr);
        if (this.locals == null) {
            this.labels = null;
            return;
        }
        pop(str2);
        pushDescriptor(str2);
        this.labels = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i10, Label label) {
        super.visitJumpInsn(i10, label);
        execute(i10, 0, null);
        if (i10 == 167) {
            this.locals = null;
            this.stack = null;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(Label label) {
        super.visitLabel(label);
        if (this.labels == null) {
            this.labels = new ArrayList(3);
        }
        this.labels.add(label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        super.visitLdcInsn(obj);
        if (this.locals == null) {
            this.labels = null;
            return;
        }
        if (obj instanceof Integer) {
            push(Opcodes.INTEGER);
        } else if (obj instanceof Long) {
            push(Opcodes.LONG);
            push(Opcodes.TOP);
        } else if (obj instanceof Float) {
            push(Opcodes.FLOAT);
        } else if (obj instanceof Double) {
            push(Opcodes.DOUBLE);
            push(Opcodes.TOP);
        } else if (obj instanceof String) {
            push("java/lang/String");
        } else if (obj instanceof Type) {
            int sort = ((Type) obj).getSort();
            if (sort == 10 || sort == 9) {
                push("java/lang/Class");
            } else {
                if (sort != 11) {
                    throw new IllegalArgumentException();
                }
                push("java/lang/invoke/MethodType");
            }
        } else if (obj instanceof Handle) {
            push("java/lang/invoke/MethodHandle");
        } else {
            if (!(obj instanceof ConstantDynamic)) {
                throw new IllegalArgumentException();
            }
            pushDescriptor(((ConstantDynamic) obj).getDescriptor());
        }
        this.labels = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i10) {
        char cCharAt = str2.charAt(0);
        this.maxLocals = Math.max(this.maxLocals, ((cCharAt == 'J' || cCharAt == 'D') ? 2 : 1) + i10);
        super.visitLocalVariable(str, str2, str3, label, label2, i10);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        super.visitLookupSwitchInsn(label, iArr, labelArr);
        execute(Opcodes.LOOKUPSWITCH, 0, null);
        this.locals = null;
        this.stack = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int i10, int i11) {
        if (this.mv != null) {
            this.maxStack = Math.max(this.maxStack, i10);
            int iMax = Math.max(this.maxLocals, i11);
            this.maxLocals = iMax;
            this.mv.visitMaxs(this.maxStack, iMax);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i10, String str, String str2, String str3, boolean z10) {
        if (this.api < 327680 && (i10 & 256) == 0) {
            super.visitMethodInsn(i10, str, str2, str3, z10);
            return;
        }
        super.visitMethodInsn(i10, str, str2, str3, z10);
        int i11 = i10 & (-257);
        if (this.locals == null) {
            this.labels = null;
            return;
        }
        pop(str3);
        if (i11 != 184) {
            Object objPop = pop();
            if (i11 == 183 && str2.equals("<init>")) {
                Object obj = objPop == Opcodes.UNINITIALIZED_THIS ? this.owner : this.uninitializedTypes.get(objPop);
                for (int i12 = 0; i12 < this.locals.size(); i12++) {
                    if (this.locals.get(i12) == objPop) {
                        this.locals.set(i12, obj);
                    }
                }
                for (int i13 = 0; i13 < this.stack.size(); i13++) {
                    if (this.stack.get(i13) == objPop) {
                        this.stack.set(i13, obj);
                    }
                }
            }
        }
        pushDescriptor(str3);
        this.labels = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i10) {
        super.visitMultiANewArrayInsn(str, i10);
        execute(Opcodes.MULTIANEWARRAY, i10, str);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i10, int i11, Label label, Label... labelArr) {
        super.visitTableSwitchInsn(i10, i11, label, labelArr);
        execute(Opcodes.TABLESWITCH, 0, null);
        this.locals = null;
        this.stack = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i10, String str) {
        if (i10 == 187) {
            if (this.labels == null) {
                Label label = new Label();
                ArrayList arrayList = new ArrayList(3);
                this.labels = arrayList;
                arrayList.add(label);
                MethodVisitor methodVisitor = this.mv;
                if (methodVisitor != null) {
                    methodVisitor.visitLabel(label);
                }
            }
            Iterator<Label> it = this.labels.iterator();
            while (it.hasNext()) {
                this.uninitializedTypes.put(it.next(), str);
            }
        }
        super.visitTypeInsn(i10, str);
        execute(i10, 0, str);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i10, int i11) {
        super.visitVarInsn(i10, i11);
        this.maxLocals = Math.max(this.maxLocals, (i10 == 22 || i10 == 24 || i10 == 55 || i10 == 57 ? 2 : 1) + i11);
        execute(i10, i11, null);
    }

    private void pop(int i10) {
        int size = this.stack.size();
        int i11 = size - i10;
        for (int i12 = size - 1; i12 >= i11; i12--) {
            this.stack.remove(i12);
        }
    }

    public AnalyzerAdapter(int i10, String str, int i11, String str2, String str3, MethodVisitor methodVisitor) {
        super(i10, methodVisitor);
        this.owner = str;
        this.locals = new ArrayList();
        this.stack = new ArrayList();
        this.uninitializedTypes = new HashMap();
        if ((i11 & 8) == 0) {
            if ("<init>".equals(str2)) {
                this.locals.add(Opcodes.UNINITIALIZED_THIS);
            } else {
                this.locals.add(str);
            }
        }
        for (Type type : Type.getArgumentTypes(str3)) {
            switch (type.getSort()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    this.locals.add(Opcodes.INTEGER);
                    break;
                case 6:
                    this.locals.add(Opcodes.FLOAT);
                    break;
                case 7:
                    this.locals.add(Opcodes.LONG);
                    this.locals.add(Opcodes.TOP);
                    break;
                case 8:
                    this.locals.add(Opcodes.DOUBLE);
                    this.locals.add(Opcodes.TOP);
                    break;
                case 9:
                    this.locals.add(type.getDescriptor());
                    break;
                case 10:
                    this.locals.add(type.getInternalName());
                    break;
                default:
                    throw new AssertionError();
            }
        }
        this.maxLocals = this.locals.size();
    }

    private void pop(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt != '(') {
            if (cCharAt != 'J' && cCharAt != 'D') {
                pop(1);
                return;
            } else {
                pop(2);
                return;
            }
        }
        int size = 0;
        for (Type type : Type.getArgumentTypes(str)) {
            size += type.getSize();
        }
        pop(size);
    }
}
