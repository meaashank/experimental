package org.jacoco.core.internal.analysis;

import org.jacoco.core.analysis.CoverageNodeImpl;
import org.jacoco.core.analysis.ICounter;
import org.jacoco.core.analysis.ICoverageNode;
import org.jacoco.core.analysis.ILine;
import org.jacoco.core.analysis.ISourceNode;

/* JADX INFO: loaded from: classes6.dex */
public class SourceNodeImpl extends CoverageNodeImpl implements ISourceNode {
    private LineImpl[] lines;
    private int offset;

    public SourceNodeImpl(ICoverageNode.ElementType elementType, String str) {
        super(elementType, str);
        this.lines = null;
        this.offset = -1;
    }

    private void incrementLine(ICounter iCounter, ICounter iCounter2, int i10) {
        ensureCapacity(i10, i10);
        LineImpl line = getLine(i10);
        int totalCount = line.getInstructionCounter().getTotalCount();
        int coveredCount = line.getInstructionCounter().getCoveredCount();
        this.lines[i10 - this.offset] = line.increment(iCounter, iCounter2);
        if (iCounter.getTotalCount() > 0) {
            if (iCounter.getCoveredCount() == 0) {
                if (totalCount == 0) {
                    this.lineCounter = this.lineCounter.increment(CounterImpl.COUNTER_1_0);
                }
            } else if (totalCount == 0) {
                this.lineCounter = this.lineCounter.increment(CounterImpl.COUNTER_0_1);
            } else if (coveredCount == 0) {
                this.lineCounter = this.lineCounter.increment(-1, 1);
            }
        }
    }

    public void ensureCapacity(int i10, int i11) {
        if (i10 == -1 || i11 == -1) {
            return;
        }
        if (this.lines == null) {
            this.offset = i10;
            this.lines = new LineImpl[(i11 - i10) + 1];
            return;
        }
        int iMin = Math.min(getFirstLine(), i10);
        int iMax = (Math.max(getLastLine(), i11) - iMin) + 1;
        LineImpl[] lineImplArr = this.lines;
        if (iMax > lineImplArr.length) {
            LineImpl[] lineImplArr2 = new LineImpl[iMax];
            System.arraycopy(lineImplArr, 0, lineImplArr2, this.offset - iMin, lineImplArr.length);
            this.offset = iMin;
            this.lines = lineImplArr2;
        }
    }

    @Override // org.jacoco.core.analysis.ISourceNode
    public int getFirstLine() {
        return this.offset;
    }

    @Override // org.jacoco.core.analysis.ISourceNode
    public int getLastLine() {
        if (this.lines == null) {
            return -1;
        }
        return (this.offset + r0.length) - 1;
    }

    public void increment(ISourceNode iSourceNode) {
        this.instructionCounter = this.instructionCounter.increment(iSourceNode.getInstructionCounter());
        this.branchCounter = this.branchCounter.increment(iSourceNode.getBranchCounter());
        this.complexityCounter = this.complexityCounter.increment(iSourceNode.getComplexityCounter());
        this.methodCounter = this.methodCounter.increment(iSourceNode.getMethodCounter());
        this.classCounter = this.classCounter.increment(iSourceNode.getClassCounter());
        int firstLine = iSourceNode.getFirstLine();
        if (firstLine != -1) {
            int lastLine = iSourceNode.getLastLine();
            ensureCapacity(firstLine, lastLine);
            while (firstLine <= lastLine) {
                ILine line = iSourceNode.getLine(firstLine);
                incrementLine(line.getInstructionCounter(), line.getBranchCounter(), firstLine);
                firstLine++;
            }
        }
    }

    @Override // org.jacoco.core.analysis.ISourceNode
    public LineImpl getLine(int i10) {
        if (this.lines == null || i10 < getFirstLine() || i10 > getLastLine()) {
            return LineImpl.EMPTY;
        }
        LineImpl lineImpl = this.lines[i10 - this.offset];
        return lineImpl == null ? LineImpl.EMPTY : lineImpl;
    }

    public void increment(ICounter iCounter, ICounter iCounter2, int i10) {
        if (i10 != -1) {
            incrementLine(iCounter, iCounter2, i10);
        }
        this.instructionCounter = this.instructionCounter.increment(iCounter);
        this.branchCounter = this.branchCounter.increment(iCounter2);
    }
}
