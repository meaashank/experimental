package org.objectweb.asm.tree;

import java.util.List;
import org.objectweb.asm.ModuleVisitor;

/* JADX INFO: loaded from: classes8.dex */
public class ModuleOpenNode {
    public int access;
    public List<String> modules;
    public String packaze;

    public ModuleOpenNode(String str, int i10, List<String> list) {
        this.packaze = str;
        this.access = i10;
        this.modules = list;
    }

    public void accept(ModuleVisitor moduleVisitor) {
        String str = this.packaze;
        int i10 = this.access;
        List<String> list = this.modules;
        moduleVisitor.visitOpen(str, i10, list == null ? null : (String[]) list.toArray(new String[0]));
    }
}
