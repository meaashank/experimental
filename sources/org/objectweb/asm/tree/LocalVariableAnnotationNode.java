package org.objectweb.asm.tree;

import java.util.List;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.TypePath;

/* JADX INFO: loaded from: classes8.dex */
public class LocalVariableAnnotationNode extends TypeAnnotationNode {
    public List<LabelNode> end;
    public List<Integer> index;
    public List<LabelNode> start;

    public LocalVariableAnnotationNode(int i10, TypePath typePath, LabelNode[] labelNodeArr, LabelNode[] labelNodeArr2, int[] iArr, String str) {
        this(589824, i10, typePath, labelNodeArr, labelNodeArr2, iArr, str);
    }

    public void accept(MethodVisitor methodVisitor, boolean z10) {
        int size = this.start.size();
        Label[] labelArr = new Label[size];
        Label[] labelArr2 = new Label[this.end.size()];
        int[] iArr = new int[this.index.size()];
        for (int i10 = 0; i10 < size; i10++) {
            labelArr[i10] = this.start.get(i10).getLabel();
            labelArr2[i10] = this.end.get(i10).getLabel();
            iArr[i10] = this.index.get(i10).intValue();
        }
        accept(methodVisitor.visitLocalVariableAnnotation(this.typeRef, this.typePath, labelArr, labelArr2, iArr, this.desc, z10));
    }

    public LocalVariableAnnotationNode(int i10, int i11, TypePath typePath, LabelNode[] labelNodeArr, LabelNode[] labelNodeArr2, int[] iArr, String str) {
        super(i10, i11, typePath, str);
        this.start = Util.asArrayList(labelNodeArr);
        this.end = Util.asArrayList(labelNodeArr2);
        this.index = Util.asArrayList(iArr);
    }
}
