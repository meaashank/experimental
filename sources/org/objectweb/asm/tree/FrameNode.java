package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.MethodVisitor;

/* JADX INFO: loaded from: classes8.dex */
public class FrameNode extends AbstractInsnNode {
    public List<Object> local;
    public List<Object> stack;
    public int type;

    private FrameNode() {
        super(-1);
    }

    private static Object[] asArray(List<Object> list) {
        int size = list.size();
        Object[] objArr = new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            Object label = list.get(i10);
            if (label instanceof LabelNode) {
                label = ((LabelNode) label).getLabel();
            }
            objArr[i10] = label;
        }
        return objArr;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(MethodVisitor methodVisitor) {
        int i10 = this.type;
        if (i10 == -1 || i10 == 0) {
            methodVisitor.visitFrame(i10, this.local.size(), asArray(this.local), this.stack.size(), asArray(this.stack));
            return;
        }
        if (i10 == 1) {
            methodVisitor.visitFrame(i10, this.local.size(), asArray(this.local), 0, null);
            return;
        }
        if (i10 == 2) {
            methodVisitor.visitFrame(i10, this.local.size(), null, 0, null);
        } else if (i10 == 3) {
            methodVisitor.visitFrame(i10, 0, null, 0, null);
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException();
            }
            methodVisitor.visitFrame(i10, 0, null, 1, asArray(this.stack));
        }
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public AbstractInsnNode clone(Map<LabelNode, LabelNode> map) {
        FrameNode frameNode = new FrameNode();
        frameNode.type = this.type;
        if (this.local != null) {
            frameNode.local = new ArrayList();
            int size = this.local.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = this.local.get(i10);
                if (obj instanceof LabelNode) {
                    obj = map.get(obj);
                }
                frameNode.local.add(obj);
            }
        }
        if (this.stack != null) {
            frameNode.stack = new ArrayList();
            int size2 = this.stack.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Object obj2 = this.stack.get(i11);
                if (obj2 instanceof LabelNode) {
                    obj2 = map.get(obj2);
                }
                frameNode.stack.add(obj2);
            }
        }
        return frameNode;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 14;
    }

    public FrameNode(int i10, int i11, Object[] objArr, int i12, Object[] objArr2) {
        super(-1);
        this.type = i10;
        if (i10 == -1 || i10 == 0) {
            this.local = Util.asArrayList(i11, objArr);
            this.stack = Util.asArrayList(i12, objArr2);
            return;
        }
        if (i10 == 1) {
            this.local = Util.asArrayList(i11, objArr);
            return;
        }
        if (i10 == 2) {
            this.local = Util.asArrayList(i11);
        } else if (i10 != 3) {
            if (i10 != 4) {
                throw new IllegalArgumentException();
            }
            this.stack = Util.asArrayList(1, objArr2);
        }
    }
}
