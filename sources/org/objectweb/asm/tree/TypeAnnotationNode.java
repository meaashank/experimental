package org.objectweb.asm.tree;

import org.objectweb.asm.TypePath;

/* JADX INFO: loaded from: classes8.dex */
public class TypeAnnotationNode extends AnnotationNode {
    public TypePath typePath;
    public int typeRef;

    public TypeAnnotationNode(int i10, TypePath typePath, String str) {
        this(589824, i10, typePath, str);
        if (getClass() != TypeAnnotationNode.class) {
            throw new IllegalStateException();
        }
    }

    public TypeAnnotationNode(int i10, int i11, TypePath typePath, String str) {
        super(i10, str);
        this.typeRef = i11;
        this.typePath = typePath;
    }
}
