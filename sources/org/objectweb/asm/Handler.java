package org.objectweb.asm;

/* JADX INFO: loaded from: classes8.dex */
final class Handler {
    final int catchType;
    final String catchTypeDescriptor;
    final Label endPc;
    final Label handlerPc;
    Handler nextHandler;
    final Label startPc;

    public Handler(Label label, Label label2, Label label3, int i10, String str) {
        this.startPc = label;
        this.endPc = label2;
        this.handlerPc = label3;
        this.catchType = i10;
        this.catchTypeDescriptor = str;
    }

    public static int getExceptionTableLength(Handler handler) {
        int i10 = 0;
        while (handler != null) {
            i10++;
            handler = handler.nextHandler;
        }
        return i10;
    }

    public static int getExceptionTableSize(Handler handler) {
        return (getExceptionTableLength(handler) * 8) + 2;
    }

    public static void putExceptionTable(Handler handler, ByteVector byteVector) {
        byteVector.putShort(getExceptionTableLength(handler));
        while (handler != null) {
            byteVector.putShort(handler.startPc.bytecodeOffset).putShort(handler.endPc.bytecodeOffset).putShort(handler.handlerPc.bytecodeOffset).putShort(handler.catchType);
            handler = handler.nextHandler;
        }
    }

    public static Handler removeRange(Handler handler, Label label, Label label2) {
        if (handler == null) {
            return null;
        }
        Handler handlerRemoveRange = removeRange(handler.nextHandler, label, label2);
        handler.nextHandler = handlerRemoveRange;
        Label label3 = handler.startPc;
        int i10 = label3.bytecodeOffset;
        Label label4 = handler.endPc;
        int i11 = label4.bytecodeOffset;
        int i12 = label.bytecodeOffset;
        int i13 = label2 == null ? Integer.MAX_VALUE : label2.bytecodeOffset;
        if (i12 >= i11 || i13 <= i10) {
            return handler;
        }
        if (i12 <= i10) {
            return i13 >= i11 ? handlerRemoveRange : new Handler(handler, label2, label4);
        }
        if (i13 >= i11) {
            return new Handler(handler, label3, label);
        }
        handler.nextHandler = new Handler(handler, label2, label4);
        return new Handler(handler, handler.startPc, label);
    }

    public Handler(Handler handler, Label label, Label label2) {
        this(label, label2, handler.handlerPc, handler.catchType, handler.catchTypeDescriptor);
        this.nextHandler = handler.nextHandler;
    }
}
