package org.objectweb.asm.tree;

import java.util.List;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.TypePath;

/* JADX INFO: loaded from: classes8.dex */
public class FieldNode extends FieldVisitor {
    public int access;
    public List<Attribute> attrs;
    public String desc;
    public List<AnnotationNode> invisibleAnnotations;
    public List<TypeAnnotationNode> invisibleTypeAnnotations;
    public String name;
    public String signature;
    public Object value;
    public List<AnnotationNode> visibleAnnotations;
    public List<TypeAnnotationNode> visibleTypeAnnotations;

    public FieldNode(int i10, String str, String str2, String str3, Object obj) {
        this(589824, i10, str, str2, str3, obj);
        if (getClass() != FieldNode.class) {
            throw new IllegalStateException();
        }
    }

    public void accept(ClassVisitor classVisitor) {
        FieldVisitor fieldVisitorVisitField = classVisitor.visitField(this.access, this.name, this.desc, this.signature, this.value);
        if (fieldVisitorVisitField == null) {
            return;
        }
        List<AnnotationNode> list = this.visibleAnnotations;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                AnnotationNode annotationNode = this.visibleAnnotations.get(i10);
                annotationNode.accept(fieldVisitorVisitField.visitAnnotation(annotationNode.desc, true));
            }
        }
        List<AnnotationNode> list2 = this.invisibleAnnotations;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                AnnotationNode annotationNode2 = this.invisibleAnnotations.get(i11);
                annotationNode2.accept(fieldVisitorVisitField.visitAnnotation(annotationNode2.desc, false));
            }
        }
        List<TypeAnnotationNode> list3 = this.visibleTypeAnnotations;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                TypeAnnotationNode typeAnnotationNode = this.visibleTypeAnnotations.get(i12);
                typeAnnotationNode.accept(fieldVisitorVisitField.visitTypeAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
            }
        }
        List<TypeAnnotationNode> list4 = this.invisibleTypeAnnotations;
        if (list4 != null) {
            int size4 = list4.size();
            for (int i13 = 0; i13 < size4; i13++) {
                TypeAnnotationNode typeAnnotationNode2 = this.invisibleTypeAnnotations.get(i13);
                typeAnnotationNode2.accept(fieldVisitorVisitField.visitTypeAnnotation(typeAnnotationNode2.typeRef, typeAnnotationNode2.typePath, typeAnnotationNode2.desc, false));
            }
        }
        List<Attribute> list5 = this.attrs;
        if (list5 != null) {
            int size5 = list5.size();
            for (int i14 = 0; i14 < size5; i14++) {
                fieldVisitorVisitField.visitAttribute(this.attrs.get(i14));
            }
        }
        fieldVisitorVisitField.visitEnd();
    }

    public void check(int i10) {
        if (i10 == 262144) {
            List<TypeAnnotationNode> list = this.visibleTypeAnnotations;
            if (list != null && !list.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
            List<TypeAnnotationNode> list2 = this.invisibleTypeAnnotations;
            if (list2 != null && !list2.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
        }
    }

    @Override // org.objectweb.asm.FieldVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z10) {
        AnnotationNode annotationNode = new AnnotationNode(str);
        if (z10) {
            this.visibleAnnotations = Util.add(this.visibleAnnotations, annotationNode);
            return annotationNode;
        }
        this.invisibleAnnotations = Util.add(this.invisibleAnnotations, annotationNode);
        return annotationNode;
    }

    @Override // org.objectweb.asm.FieldVisitor
    public void visitAttribute(Attribute attribute) {
        this.attrs = Util.add(this.attrs, attribute);
    }

    @Override // org.objectweb.asm.FieldVisitor
    public void visitEnd() {
    }

    @Override // org.objectweb.asm.FieldVisitor
    public AnnotationVisitor visitTypeAnnotation(int i10, TypePath typePath, String str, boolean z10) {
        TypeAnnotationNode typeAnnotationNode = new TypeAnnotationNode(i10, typePath, str);
        if (z10) {
            this.visibleTypeAnnotations = Util.add(this.visibleTypeAnnotations, typeAnnotationNode);
            return typeAnnotationNode;
        }
        this.invisibleTypeAnnotations = Util.add(this.invisibleTypeAnnotations, typeAnnotationNode);
        return typeAnnotationNode;
    }

    public FieldNode(int i10, int i11, String str, String str2, String str3, Object obj) {
        super(i10);
        this.access = i11;
        this.name = str;
        this.desc = str2;
        this.signature = str3;
        this.value = obj;
    }
}
