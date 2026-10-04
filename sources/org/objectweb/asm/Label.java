package org.objectweb.asm;

import kotlin.H0;

/* JADX INFO: loaded from: classes8.dex */
public class Label {
    static final Label EMPTY_LIST = new Label();
    static final int FLAG_DEBUG_ONLY = 1;
    static final int FLAG_JUMP_TARGET = 2;
    static final int FLAG_REACHABLE = 8;
    static final int FLAG_RESOLVED = 4;
    static final int FLAG_SUBROUTINE_CALLER = 16;
    static final int FLAG_SUBROUTINE_END = 64;
    static final int FLAG_SUBROUTINE_START = 32;
    static final int FORWARD_REFERENCES_CAPACITY_INCREMENT = 6;
    static final int FORWARD_REFERENCE_HANDLE_MASK = 268435455;
    static final int FORWARD_REFERENCE_TYPE_MASK = -268435456;
    static final int FORWARD_REFERENCE_TYPE_SHORT = 268435456;
    static final int FORWARD_REFERENCE_TYPE_WIDE = 536870912;
    static final int LINE_NUMBERS_CAPACITY_INCREMENT = 4;
    int bytecodeOffset;
    short flags;
    private int[] forwardReferences;
    Frame frame;
    public Object info;
    short inputStackSize;
    private short lineNumber;
    Label nextBasicBlock;
    Label nextListElement;
    private int[] otherLineNumbers;
    Edge outgoingEdges;
    short outputStackMax;
    short outputStackSize;
    short subroutineId;

    private void addForwardReference(int i10, int i11, int i12) {
        if (this.forwardReferences == null) {
            this.forwardReferences = new int[6];
        }
        int[] iArr = this.forwardReferences;
        int i13 = iArr[0];
        if (i13 + 2 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.forwardReferences = iArr2;
        }
        int[] iArr3 = this.forwardReferences;
        iArr3[i13 + 1] = i10;
        int i14 = i13 + 2;
        iArr3[i14] = i11 | i12;
        iArr3[0] = i14;
    }

    private Label pushSuccessors(Label label) {
        for (Edge edge = this.outgoingEdges; edge != null; edge = edge.nextEdge) {
            if ((this.flags & 16) == 0 || edge != this.outgoingEdges.nextEdge) {
                Label label2 = edge.successor;
                if (label2.nextListElement == null) {
                    label2.nextListElement = label;
                    label = label2;
                }
            }
        }
        return label;
    }

    public final void accept(MethodVisitor methodVisitor, boolean z10) {
        short s10;
        methodVisitor.visitLabel(this);
        if (!z10 || (s10 = this.lineNumber) == 0) {
            return;
        }
        methodVisitor.visitLineNumber(s10 & H0.f217455d, this);
        if (this.otherLineNumbers == null) {
            return;
        }
        int i10 = 1;
        while (true) {
            int[] iArr = this.otherLineNumbers;
            if (i10 > iArr[0]) {
                return;
            }
            methodVisitor.visitLineNumber(iArr[i10], this);
            i10++;
        }
    }

    public final void addLineNumber(int i10) {
        if (this.lineNumber == 0) {
            this.lineNumber = (short) i10;
            return;
        }
        if (this.otherLineNumbers == null) {
            this.otherLineNumbers = new int[4];
        }
        int[] iArr = this.otherLineNumbers;
        int i11 = iArr[0] + 1;
        iArr[0] = i11;
        if (i11 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 4];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.otherLineNumbers = iArr2;
        }
        this.otherLineNumbers[i11] = i10;
    }

    public final void addSubroutineRetSuccessors(Label label) {
        Label label2 = EMPTY_LIST;
        this.nextListElement = label2;
        Label label3 = label2;
        Label labelPushSuccessors = this;
        while (labelPushSuccessors != EMPTY_LIST) {
            Label label4 = labelPushSuccessors.nextListElement;
            labelPushSuccessors.nextListElement = label3;
            if ((labelPushSuccessors.flags & 64) != 0 && labelPushSuccessors.subroutineId != label.subroutineId) {
                labelPushSuccessors.outgoingEdges = new Edge(labelPushSuccessors.outputStackSize, label.outgoingEdges.successor, labelPushSuccessors.outgoingEdges);
            }
            label3 = labelPushSuccessors;
            labelPushSuccessors = labelPushSuccessors.pushSuccessors(label4);
        }
        while (label3 != EMPTY_LIST) {
            Label label5 = label3.nextListElement;
            label3.nextListElement = null;
            label3 = label5;
        }
    }

    public final Label getCanonicalInstance() {
        Frame frame = this.frame;
        return frame == null ? this : frame.owner;
    }

    public int getOffset() {
        if ((this.flags & 4) != 0) {
            return this.bytecodeOffset;
        }
        throw new IllegalStateException("Label offset position has not been resolved yet");
    }

    public final void markSubroutine(short s10) {
        this.nextListElement = EMPTY_LIST;
        Label labelPushSuccessors = this;
        while (labelPushSuccessors != EMPTY_LIST) {
            Label label = labelPushSuccessors.nextListElement;
            labelPushSuccessors.nextListElement = null;
            if (labelPushSuccessors.subroutineId == 0) {
                labelPushSuccessors.subroutineId = s10;
                labelPushSuccessors = labelPushSuccessors.pushSuccessors(label);
            } else {
                labelPushSuccessors = label;
            }
        }
    }

    public final void put(ByteVector byteVector, int i10, boolean z10) {
        if ((this.flags & 4) != 0) {
            if (z10) {
                byteVector.putInt(this.bytecodeOffset - i10);
                return;
            } else {
                byteVector.putShort(this.bytecodeOffset - i10);
                return;
            }
        }
        if (z10) {
            addForwardReference(i10, 536870912, byteVector.length);
            byteVector.putInt(-1);
        } else {
            addForwardReference(i10, 268435456, byteVector.length);
            byteVector.putShort(-1);
        }
    }

    public final boolean resolve(byte[] bArr, int i10) {
        this.flags = (short) (this.flags | 4);
        this.bytecodeOffset = i10;
        int[] iArr = this.forwardReferences;
        boolean z10 = false;
        if (iArr == null) {
            return false;
        }
        for (int i11 = iArr[0]; i11 > 0; i11 -= 2) {
            int[] iArr2 = this.forwardReferences;
            int i12 = iArr2[i11 - 1];
            int i13 = iArr2[i11];
            int i14 = i10 - i12;
            int i15 = FORWARD_REFERENCE_HANDLE_MASK & i13;
            if ((i13 & FORWARD_REFERENCE_TYPE_MASK) == 268435456) {
                if (i14 < -32768 || i14 > 32767) {
                    int i16 = bArr[i12] & 255;
                    if (i16 < 198) {
                        bArr[i12] = (byte) (i16 + 49);
                    } else {
                        bArr[i12] = (byte) (i16 + 20);
                    }
                    z10 = true;
                }
                bArr[i15] = (byte) (i14 >>> 8);
                bArr[i15 + 1] = (byte) i14;
            } else {
                bArr[i15] = (byte) (i14 >>> 24);
                bArr[i15 + 1] = (byte) (i14 >>> 16);
                bArr[i15 + 2] = (byte) (i14 >>> 8);
                bArr[i15 + 3] = (byte) i14;
            }
        }
        return z10;
    }

    public String toString() {
        return "L" + System.identityHashCode(this);
    }
}
