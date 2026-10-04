package org.jacoco.core.internal.instr;

import org.jacoco.core.internal.flow.IFrame;
import org.jacoco.core.internal.flow.LabelInfo;
import org.jacoco.core.internal.flow.MethodProbesVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes6.dex */
class MethodInstrumenter extends MethodProbesVisitor {
    private final IProbeInserter probeInserter;

    public MethodInstrumenter(MethodVisitor methodVisitor, IProbeInserter iProbeInserter) {
        super(methodVisitor);
        this.probeInserter = iProbeInserter;
    }

    private Label createIntermediate(Label label) {
        if (LabelInfo.getProbeId(label) == -1) {
            return label;
        }
        if (LabelInfo.isDone(label)) {
            return LabelInfo.getIntermediateLabel(label);
        }
        Label label2 = new Label();
        LabelInfo.setIntermediateLabel(label, label2);
        LabelInfo.setDone(label);
        return label2;
    }

    private Label[] createIntermediates(Label[] labelArr) {
        Label[] labelArr2 = new Label[labelArr.length];
        for (int i10 = 0; i10 < labelArr.length; i10++) {
            labelArr2[i10] = createIntermediate(labelArr[i10]);
        }
        return labelArr2;
    }

    private int getInverted(int i10) {
        if (i10 == 198) {
            return 199;
        }
        if (i10 == 199) {
            return 198;
        }
        switch (i10) {
            case 153:
                return 154;
            case 154:
                return 153;
            case 155:
                return 156;
            case 156:
                return 155;
            case 157:
                return 158;
            case 158:
                return 157;
            case Opcodes.IF_ICMPEQ /* 159 */:
                return 160;
            case 160:
                return Opcodes.IF_ICMPEQ;
            case Opcodes.IF_ICMPLT /* 161 */:
                return Opcodes.IF_ICMPGE;
            case Opcodes.IF_ICMPGE /* 162 */:
                return Opcodes.IF_ICMPLT;
            case Opcodes.IF_ICMPGT /* 163 */:
                return Opcodes.IF_ICMPLE;
            case Opcodes.IF_ICMPLE /* 164 */:
                return Opcodes.IF_ICMPGT;
            case 165:
                return Opcodes.IF_ACMPNE;
            case Opcodes.IF_ACMPNE /* 166 */:
                return 165;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void insertIntermediateProbe(Label label, IFrame iFrame) {
        int probeId = LabelInfo.getProbeId(label);
        if (probeId == -1 || LabelInfo.isDone(label)) {
            return;
        }
        this.mv.visitLabel(LabelInfo.getIntermediateLabel(label));
        iFrame.accept(this.mv);
        this.probeInserter.insertProbe(probeId);
        this.mv.visitJumpInsn(Opcodes.GOTO, label);
        LabelInfo.setDone(label);
    }

    private void insertIntermediateProbes(Label label, Label[] labelArr, IFrame iFrame) {
        LabelInfo.resetDone(label);
        LabelInfo.resetDone(labelArr);
        insertIntermediateProbe(label, iFrame);
        for (Label label2 : labelArr) {
            insertIntermediateProbe(label2, iFrame);
        }
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitInsnWithProbe(int i10, int i11) {
        this.probeInserter.insertProbe(i11);
        this.mv.visitInsn(i10);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitJumpInsnWithProbe(int i10, Label label, int i11, IFrame iFrame) {
        if (i10 == 167) {
            this.probeInserter.insertProbe(i11);
            this.mv.visitJumpInsn(Opcodes.GOTO, label);
            return;
        }
        Label label2 = new Label();
        this.mv.visitJumpInsn(getInverted(i10), label2);
        this.probeInserter.insertProbe(i11);
        this.mv.visitJumpInsn(Opcodes.GOTO, label);
        this.mv.visitLabel(label2);
        iFrame.accept(this.mv);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitLookupSwitchInsnWithProbes(Label label, int[] iArr, Label[] labelArr, IFrame iFrame) {
        LabelInfo.resetDone(label);
        LabelInfo.resetDone(labelArr);
        this.mv.visitLookupSwitchInsn(createIntermediate(label), iArr, createIntermediates(labelArr));
        insertIntermediateProbes(label, labelArr, iFrame);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitProbe(int i10) {
        this.probeInserter.insertProbe(i10);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitTableSwitchInsnWithProbes(int i10, int i11, Label label, Label[] labelArr, IFrame iFrame) {
        LabelInfo.resetDone(label);
        LabelInfo.resetDone(labelArr);
        this.mv.visitTableSwitchInsn(i10, i11, createIntermediate(label), createIntermediates(labelArr));
        insertIntermediateProbes(label, labelArr, iFrame);
    }
}
