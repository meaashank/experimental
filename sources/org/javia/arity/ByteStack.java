package org.javia.arity;

/* JADX INFO: loaded from: classes6.dex */
class ByteStack {
    private byte[] data = new byte[8];
    private int size = 0;

    public void clear() {
        this.size = 0;
    }

    public byte pop() {
        byte[] bArr = this.data;
        int i10 = this.size - 1;
        this.size = i10;
        return bArr[i10];
    }

    public void push(byte b10) {
        int i10 = this.size;
        byte[] bArr = this.data;
        if (i10 >= bArr.length) {
            byte[] bArr2 = new byte[bArr.length << 1];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.data = bArr2;
        }
        byte[] bArr3 = this.data;
        int i11 = this.size;
        this.size = i11 + 1;
        bArr3[i11] = b10;
    }

    public byte[] toArray() {
        int i10 = this.size;
        byte[] bArr = new byte[i10];
        System.arraycopy(this.data, 0, bArr, 0, i10);
        return bArr;
    }
}
