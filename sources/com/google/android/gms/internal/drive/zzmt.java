package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes4.dex */
final class zzmt {
    public static String zzc(zzjc zzjcVar) {
        zzmu zzmuVar = new zzmu(zzjcVar);
        StringBuilder sb2 = new StringBuilder(zzmuVar.size());
        for (int i10 = 0; i10 < zzmuVar.size(); i10++) {
            byte bZzs = zzmuVar.zzs(i10);
            if (bZzs == 34) {
                sb2.append("\\\"");
            } else if (bZzs == 39) {
                sb2.append("\\'");
            } else if (bZzs != 92) {
                switch (bZzs) {
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
                        if (bZzs < 32 || bZzs > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bZzs >>> 6) & 3) + 48));
                            sb2.append((char) (((bZzs >>> 3) & 7) + 48));
                            sb2.append((char) ((bZzs & 7) + 48));
                        } else {
                            sb2.append((char) bZzs);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
