package org.objectweb.asm.commons;

import java.util.Collections;
import java.util.Comparator;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TryCatchBlockNode;

/* JADX INFO: loaded from: classes8.dex */
public class TryCatchBlockSorter extends MethodNode {
    public TryCatchBlockSorter(MethodVisitor methodVisitor, int i10, String str, String str2, String str3, String[] strArr) {
        this(589824, methodVisitor, i10, str, str2, str3, strArr);
        if (getClass() != TryCatchBlockSorter.class) {
            throw new IllegalStateException();
        }
    }

    @Override // org.objectweb.asm.tree.MethodNode, org.objectweb.asm.MethodVisitor
    public void visitEnd() {
        Collections.sort(this.tryCatchBlocks, new Comparator<TryCatchBlockNode>() { // from class: org.objectweb.asm.commons.TryCatchBlockSorter.1
            private int blockLength(TryCatchBlockNode tryCatchBlockNode) {
                return TryCatchBlockSorter.this.instructions.indexOf(tryCatchBlockNode.end) - TryCatchBlockSorter.this.instructions.indexOf(tryCatchBlockNode.start);
            }

            @Override // java.util.Comparator
            public int compare(TryCatchBlockNode tryCatchBlockNode, TryCatchBlockNode tryCatchBlockNode2) {
                return blockLength(tryCatchBlockNode) - blockLength(tryCatchBlockNode2);
            }
        });
        for (int i10 = 0; i10 < this.tryCatchBlocks.size(); i10++) {
            this.tryCatchBlocks.get(i10).updateIndex(i10);
        }
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            accept(methodVisitor);
        }
    }

    public TryCatchBlockSorter(int i10, MethodVisitor methodVisitor, int i11, String str, String str2, String str3, String[] strArr) {
        super(i10, i11, str, str2, str3, strArr);
        this.mv = methodVisitor;
    }
}
