package org.objectweb.asm.tree;

import java.util.List;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

/* JADX INFO: loaded from: classes8.dex */
public class TryCatchBlockNode {
    public LabelNode end;
    public LabelNode handler;
    public List<TypeAnnotationNode> invisibleTypeAnnotations;
    public LabelNode start;
    public String type;
    public List<TypeAnnotationNode> visibleTypeAnnotations;

    public TryCatchBlockNode(LabelNode labelNode, LabelNode labelNode2, LabelNode labelNode3, String str) {
        this.start = labelNode;
        this.end = labelNode2;
        this.handler = labelNode3;
        this.type = str;
    }

    public void accept(MethodVisitor methodVisitor) {
        Label label = this.start.getLabel();
        Label label2 = this.end.getLabel();
        LabelNode labelNode = this.handler;
        methodVisitor.visitTryCatchBlock(label, label2, labelNode == null ? null : labelNode.getLabel(), this.type);
        List<TypeAnnotationNode> list = this.visibleTypeAnnotations;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                TypeAnnotationNode typeAnnotationNode = this.visibleTypeAnnotations.get(i10);
                typeAnnotationNode.accept(methodVisitor.visitTryCatchAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
            }
        }
        List<TypeAnnotationNode> list2 = this.invisibleTypeAnnotations;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                TypeAnnotationNode typeAnnotationNode2 = this.invisibleTypeAnnotations.get(i11);
                typeAnnotationNode2.accept(methodVisitor.visitTryCatchAnnotation(typeAnnotationNode2.typeRef, typeAnnotationNode2.typePath, typeAnnotationNode2.desc, false));
            }
        }
    }

    public void updateIndex(int i10) {
        int i11 = (i10 << 8) | 1107296256;
        List<TypeAnnotationNode> list = this.visibleTypeAnnotations;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                this.visibleTypeAnnotations.get(i12).typeRef = i11;
            }
        }
        List<TypeAnnotationNode> list2 = this.invisibleTypeAnnotations;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                this.invisibleTypeAnnotations.get(i13).typeRef = i11;
            }
        }
    }
}
