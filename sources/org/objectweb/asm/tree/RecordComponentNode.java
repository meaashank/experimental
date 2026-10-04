package org.objectweb.asm.tree;

import java.util.List;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.TypePath;

/* JADX INFO: loaded from: classes8.dex */
public class RecordComponentNode extends RecordComponentVisitor {
    public List<Attribute> attrs;
    public String descriptor;
    public List<AnnotationNode> invisibleAnnotations;
    public List<TypeAnnotationNode> invisibleTypeAnnotations;
    public String name;
    public String signature;
    public List<AnnotationNode> visibleAnnotations;
    public List<TypeAnnotationNode> visibleTypeAnnotations;

    public RecordComponentNode(String str, String str2, String str3) {
        this(589824, str, str2, str3);
        if (getClass() != RecordComponentNode.class) {
            throw new IllegalStateException();
        }
    }

    public void accept(ClassVisitor classVisitor) {
        RecordComponentVisitor recordComponentVisitorVisitRecordComponent = classVisitor.visitRecordComponent(this.name, this.descriptor, this.signature);
        if (recordComponentVisitorVisitRecordComponent == null) {
            return;
        }
        List<AnnotationNode> list = this.visibleAnnotations;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                AnnotationNode annotationNode = this.visibleAnnotations.get(i10);
                annotationNode.accept(recordComponentVisitorVisitRecordComponent.visitAnnotation(annotationNode.desc, true));
            }
        }
        List<AnnotationNode> list2 = this.invisibleAnnotations;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                AnnotationNode annotationNode2 = this.invisibleAnnotations.get(i11);
                annotationNode2.accept(recordComponentVisitorVisitRecordComponent.visitAnnotation(annotationNode2.desc, false));
            }
        }
        List<TypeAnnotationNode> list3 = this.visibleTypeAnnotations;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                TypeAnnotationNode typeAnnotationNode = this.visibleTypeAnnotations.get(i12);
                typeAnnotationNode.accept(recordComponentVisitorVisitRecordComponent.visitTypeAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
            }
        }
        List<TypeAnnotationNode> list4 = this.invisibleTypeAnnotations;
        if (list4 != null) {
            int size4 = list4.size();
            for (int i13 = 0; i13 < size4; i13++) {
                TypeAnnotationNode typeAnnotationNode2 = this.invisibleTypeAnnotations.get(i13);
                typeAnnotationNode2.accept(recordComponentVisitorVisitRecordComponent.visitTypeAnnotation(typeAnnotationNode2.typeRef, typeAnnotationNode2.typePath, typeAnnotationNode2.desc, false));
            }
        }
        List<Attribute> list5 = this.attrs;
        if (list5 != null) {
            int size5 = list5.size();
            for (int i14 = 0; i14 < size5; i14++) {
                recordComponentVisitorVisitRecordComponent.visitAttribute(this.attrs.get(i14));
            }
        }
        recordComponentVisitorVisitRecordComponent.visitEnd();
    }

    public void check(int i10) {
        if (i10 < 524288) {
            throw new UnsupportedClassVersionException();
        }
    }

    @Override // org.objectweb.asm.RecordComponentVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z10) {
        AnnotationNode annotationNode = new AnnotationNode(str);
        if (z10) {
            this.visibleAnnotations = Util.add(this.visibleAnnotations, annotationNode);
            return annotationNode;
        }
        this.invisibleAnnotations = Util.add(this.invisibleAnnotations, annotationNode);
        return annotationNode;
    }

    @Override // org.objectweb.asm.RecordComponentVisitor
    public void visitAttribute(Attribute attribute) {
        this.attrs = Util.add(this.attrs, attribute);
    }

    @Override // org.objectweb.asm.RecordComponentVisitor
    public void visitEnd() {
    }

    @Override // org.objectweb.asm.RecordComponentVisitor
    public AnnotationVisitor visitTypeAnnotation(int i10, TypePath typePath, String str, boolean z10) {
        TypeAnnotationNode typeAnnotationNode = new TypeAnnotationNode(i10, typePath, str);
        if (z10) {
            this.visibleTypeAnnotations = Util.add(this.visibleTypeAnnotations, typeAnnotationNode);
            return typeAnnotationNode;
        }
        this.invisibleTypeAnnotations = Util.add(this.invisibleTypeAnnotations, typeAnnotationNode);
        return typeAnnotationNode;
    }

    public RecordComponentNode(int i10, String str, String str2, String str3) {
        super(i10);
        this.name = str;
        this.descriptor = str2;
        this.signature = str3;
    }
}
