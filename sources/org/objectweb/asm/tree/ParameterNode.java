package org.objectweb.asm.tree;

import org.objectweb.asm.MethodVisitor;

/* JADX INFO: loaded from: classes8.dex */
public class ParameterNode {
    public int access;
    public String name;

    public ParameterNode(String str, int i10) {
        this.name = str;
        this.access = i10;
    }

    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitParameter(this.name, this.access);
    }
}
