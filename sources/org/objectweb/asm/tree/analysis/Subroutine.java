package org.objectweb.asm.tree.analysis;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;

/* JADX INFO: loaded from: classes8.dex */
final class Subroutine {
    final List<JumpInsnNode> callers;
    final boolean[] localsUsed;
    final LabelNode start;

    public Subroutine(LabelNode labelNode, int i10, JumpInsnNode jumpInsnNode) {
        this.start = labelNode;
        this.localsUsed = new boolean[i10];
        ArrayList arrayList = new ArrayList();
        this.callers = arrayList;
        arrayList.add(jumpInsnNode);
    }

    public boolean merge(Subroutine subroutine) {
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            boolean[] zArr = this.localsUsed;
            if (i10 >= zArr.length) {
                break;
            }
            if (subroutine.localsUsed[i10] && !zArr[i10]) {
                zArr[i10] = true;
                z10 = true;
            }
            i10++;
        }
        if (subroutine.start == this.start) {
            for (int i11 = 0; i11 < subroutine.callers.size(); i11++) {
                JumpInsnNode jumpInsnNode = subroutine.callers.get(i11);
                if (!this.callers.contains(jumpInsnNode)) {
                    this.callers.add(jumpInsnNode);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public Subroutine(Subroutine subroutine) {
        this.start = subroutine.start;
        this.localsUsed = (boolean[]) subroutine.localsUsed.clone();
        this.callers = new ArrayList(subroutine.callers);
    }
}
