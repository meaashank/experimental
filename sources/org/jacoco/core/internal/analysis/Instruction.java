package org.jacoco.core.internal.analysis;

import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import org.jacoco.core.analysis.ICounter;

/* JADX INFO: loaded from: classes6.dex */
public class Instruction {
    private int branches = 0;
    private final BitSet coveredBranches = new BitSet();
    private final int line;
    private Instruction predecessor;
    private int predecessorBranch;

    public Instruction(int i10) {
        this.line = i10;
    }

    private static void propagateExecutedBranch(Instruction instruction, int i10) {
        while (instruction != null) {
            if (!instruction.coveredBranches.isEmpty()) {
                instruction.coveredBranches.set(i10);
                return;
            } else {
                instruction.coveredBranches.set(i10);
                i10 = instruction.predecessorBranch;
                instruction = instruction.predecessor;
            }
        }
    }

    public void addBranch(Instruction instruction, int i10) {
        this.branches++;
        instruction.predecessor = this;
        instruction.predecessorBranch = i10;
        if (instruction.coveredBranches.isEmpty()) {
            return;
        }
        propagateExecutedBranch(this, i10);
    }

    public ICounter getBranchCounter() {
        if (this.branches < 2) {
            return CounterImpl.COUNTER_0_0;
        }
        int iCardinality = this.coveredBranches.cardinality();
        return CounterImpl.getInstance(this.branches - iCardinality, iCardinality);
    }

    public ICounter getInstructionCounter() {
        return this.coveredBranches.isEmpty() ? CounterImpl.COUNTER_1_0 : CounterImpl.COUNTER_0_1;
    }

    public int getLine() {
        return this.line;
    }

    public Instruction merge(Instruction instruction) {
        Instruction instruction2 = new Instruction(this.line);
        instruction2.branches = this.branches;
        instruction2.coveredBranches.or(this.coveredBranches);
        instruction2.coveredBranches.or(instruction.coveredBranches);
        return instruction2;
    }

    public Instruction replaceBranches(Collection<Instruction> collection) {
        Instruction instruction = new Instruction(this.line);
        instruction.branches = collection.size();
        Iterator<Instruction> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (!it.next().coveredBranches.isEmpty()) {
                instruction.coveredBranches.set(i10);
                i10++;
            }
        }
        return instruction;
    }

    public void addBranch(boolean z10, int i10) {
        this.branches++;
        if (z10) {
            propagateExecutedBranch(this, i10);
        }
    }
}
