package org.objectweb.asm.tree;

import org.objectweb.asm.ModuleVisitor;

/* JADX INFO: loaded from: classes8.dex */
public class ModuleRequireNode {
    public int access;
    public String module;
    public String version;

    public ModuleRequireNode(String str, int i10, String str2) {
        this.module = str;
        this.access = i10;
        this.version = str2;
    }

    public void accept(ModuleVisitor moduleVisitor) {
        moduleVisitor.visitRequire(this.module, this.access, this.version);
    }
}
