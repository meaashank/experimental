package org.objectweb.asm.commons;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes8.dex */
public class StaticInitMerger extends ClassVisitor {
    private MethodVisitor mergedClinitVisitor;
    private int numClinitMethods;
    private String owner;
    private final String renamedClinitMethodPrefix;

    public StaticInitMerger(String str, ClassVisitor classVisitor) {
        this(589824, str, classVisitor);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visit(int i10, int i11, String str, String str2, String str3, String[] strArr) {
        super.visit(i10, i11, str, str2, str3, strArr);
        this.owner = str;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitEnd() {
        MethodVisitor methodVisitor = this.mergedClinitVisitor;
        if (methodVisitor != null) {
            methodVisitor.visitInsn(Opcodes.RETURN);
            this.mergedClinitVisitor.visitMaxs(0, 0);
        }
        super.visitEnd();
    }

    @Override // org.objectweb.asm.ClassVisitor
    public MethodVisitor visitMethod(int i10, String str, String str2, String str3, String[] strArr) {
        if (!"<clinit>".equals(str)) {
            return super.visitMethod(i10, str, str2, str3, strArr);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.renamedClinitMethodPrefix);
        int i11 = this.numClinitMethods;
        this.numClinitMethods = i11 + 1;
        sb2.append(i11);
        String string = sb2.toString();
        MethodVisitor methodVisitorVisitMethod = super.visitMethod(10, string, str2, str3, strArr);
        if (this.mergedClinitVisitor == null) {
            this.mergedClinitVisitor = super.visitMethod(10, str, str2, null, null);
        }
        this.mergedClinitVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, this.owner, string, str2, false);
        return methodVisitorVisitMethod;
    }

    public StaticInitMerger(int i10, String str, ClassVisitor classVisitor) {
        super(i10, classVisitor);
        this.renamedClinitMethodPrefix = str;
    }
}
