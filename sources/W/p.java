package w;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final byte[] f239990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f239991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public List<byte[]> f239992c;

    public p(@NonNull byte[] bArr) {
        this.f239990a = bArr;
    }

    public static int b(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        for (int i10 = 0; i10 < Math.min(bArr.length, bArr2.length); i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return 0;
    }

    @NonNull
    public static p c(String str, List<byte[]> list) throws IOException {
        return new p(d(str, list), str, list);
    }

    @NonNull
    public static byte[] d(@NonNull String str, @NonNull List<byte[]> list) throws IOException {
        Collections.sort(list, new o());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        for (byte[] bArr : list) {
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    @NonNull
    public static p e(@NonNull byte[] bArr) {
        return new p(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f239990a, ((p) obj).f239990a);
    }

    @NonNull
    public byte[] f(int i10) throws IOException {
        i();
        List<byte[]> list = this.f239992c;
        if (list != null) {
            return Arrays.copyOf(list.get(i10), this.f239992c.get(i10).length);
        }
        throw new IllegalStateException();
    }

    public int g() throws IOException {
        i();
        List<byte[]> list = this.f239992c;
        if (list != null) {
            return list.size();
        }
        throw new IllegalStateException();
    }

    @NonNull
    public String h() throws IOException {
        i();
        String str = this.f239991b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f239990a);
    }

    public final void i() throws IOException {
        if (this.f239991b != null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.f239990a));
        this.f239991b = dataInputStream.readUTF();
        int i10 = dataInputStream.readInt();
        this.f239992c = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = dataInputStream.readInt();
            byte[] bArr = new byte[i12];
            if (dataInputStream.read(bArr) != i12) {
                throw new IllegalStateException("Could not read fingerprint");
            }
            this.f239992c.add(bArr);
        }
    }

    @NonNull
    public byte[] j() {
        byte[] bArr = this.f239990a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public p(@NonNull byte[] bArr, @NonNull String str, @NonNull List<byte[]> list) {
        this.f239990a = bArr;
        this.f239991b = str;
        this.f239992c = new ArrayList(list.size());
        for (byte[] bArr2 : list) {
            this.f239992c.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }
}
