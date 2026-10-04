package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ModuleVisitor;

/* JADX INFO: loaded from: classes8.dex */
public class ModuleNode extends ModuleVisitor {
    public int access;
    public List<ModuleExportNode> exports;
    public String mainClass;
    public String name;
    public List<ModuleOpenNode> opens;
    public List<String> packages;
    public List<ModuleProvideNode> provides;
    public List<ModuleRequireNode> requires;
    public List<String> uses;
    public String version;

    public ModuleNode(String str, int i10, String str2) {
        super(589824);
        if (getClass() != ModuleNode.class) {
            throw new IllegalStateException();
        }
        this.name = str;
        this.access = i10;
        this.version = str2;
    }

    public void accept(ClassVisitor classVisitor) {
        ModuleVisitor moduleVisitorVisitModule = classVisitor.visitModule(this.name, this.access, this.version);
        if (moduleVisitorVisitModule == null) {
            return;
        }
        String str = this.mainClass;
        if (str != null) {
            moduleVisitorVisitModule.visitMainClass(str);
        }
        List<String> list = this.packages;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                moduleVisitorVisitModule.visitPackage(this.packages.get(i10));
            }
        }
        List<ModuleRequireNode> list2 = this.requires;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.requires.get(i11).accept(moduleVisitorVisitModule);
            }
        }
        List<ModuleExportNode> list3 = this.exports;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                this.exports.get(i12).accept(moduleVisitorVisitModule);
            }
        }
        List<ModuleOpenNode> list4 = this.opens;
        if (list4 != null) {
            int size4 = list4.size();
            for (int i13 = 0; i13 < size4; i13++) {
                this.opens.get(i13).accept(moduleVisitorVisitModule);
            }
        }
        List<String> list5 = this.uses;
        if (list5 != null) {
            int size5 = list5.size();
            for (int i14 = 0; i14 < size5; i14++) {
                moduleVisitorVisitModule.visitUse(this.uses.get(i14));
            }
        }
        List<ModuleProvideNode> list6 = this.provides;
        if (list6 != null) {
            int size6 = list6.size();
            for (int i15 = 0; i15 < size6; i15++) {
                this.provides.get(i15).accept(moduleVisitorVisitModule);
            }
        }
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitEnd() {
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitExport(String str, int i10, String... strArr) {
        if (this.exports == null) {
            this.exports = new ArrayList(5);
        }
        this.exports.add(new ModuleExportNode(str, i10, Util.asArrayList(strArr)));
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitMainClass(String str) {
        this.mainClass = str;
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitOpen(String str, int i10, String... strArr) {
        if (this.opens == null) {
            this.opens = new ArrayList(5);
        }
        this.opens.add(new ModuleOpenNode(str, i10, Util.asArrayList(strArr)));
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitPackage(String str) {
        if (this.packages == null) {
            this.packages = new ArrayList(5);
        }
        this.packages.add(str);
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitProvide(String str, String... strArr) {
        if (this.provides == null) {
            this.provides = new ArrayList(5);
        }
        this.provides.add(new ModuleProvideNode(str, Util.asArrayList(strArr)));
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitRequire(String str, int i10, String str2) {
        if (this.requires == null) {
            this.requires = new ArrayList(5);
        }
        this.requires.add(new ModuleRequireNode(str, i10, str2));
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitUse(String str) {
        if (this.uses == null) {
            this.uses = new ArrayList(5);
        }
        this.uses.add(str);
    }

    public ModuleNode(int i10, String str, int i11, String str2, List<ModuleRequireNode> list, List<ModuleExportNode> list2, List<ModuleOpenNode> list3, List<String> list4, List<ModuleProvideNode> list5) {
        super(i10);
        this.name = str;
        this.access = i11;
        this.version = str2;
        this.requires = list;
        this.exports = list2;
        this.opens = list3;
        this.uses = list4;
        this.provides = list5;
    }
}
