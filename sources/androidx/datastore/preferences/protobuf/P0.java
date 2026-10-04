package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class P0 {

    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ByteString f112673a;

        public a(ByteString byteString) {
            this.f112673a = byteString;
        }

        @Override // androidx.datastore.preferences.protobuf.P0.c
        public byte a(int i10) {
            return this.f112673a.j(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.P0.c
        public int size() {
            return this.f112673a.size();
        }
    }

    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f112674a;

        public b(byte[] bArr) {
            this.f112674a = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.P0.c
        public byte a(int i10) {
            return this.f112674a[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.P0.c
        public int size() {
            return this.f112674a.length;
        }
    }

    public interface c {
        byte a(int i10);

        int size();
    }

    public static String a(ByteString byteString) {
        return b(new a(byteString));
    }

    public static String b(c cVar) {
        StringBuilder sb2 = new StringBuilder(cVar.size());
        for (int i10 = 0; i10 < cVar.size(); i10++) {
            byte bA = cVar.a(i10);
            if (bA == 34) {
                sb2.append("\\\"");
            } else if (bA == 39) {
                sb2.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bA >>> 6) & 3) + 48));
                            sb2.append((char) (((bA >>> 3) & 7) + 48));
                            sb2.append((char) ((bA & 7) + 48));
                        } else {
                            sb2.append((char) bA);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static String c(byte[] bArr) {
        return b(new b(bArr));
    }

    public static String d(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    public static String e(String str) {
        return a(ByteString.z(str));
    }
}
