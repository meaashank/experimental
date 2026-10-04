package l6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.graphics.vector.f;
import com.prism.commons.file.FileType;
import org.objectweb.asm.Opcodes;

/* JADX INFO: renamed from: l6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5149a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f220952a = 16;

    @NonNull
    public static FileType a(@Nullable byte[] bArr, int i10) {
        return (bArr == null || i10 < 4) ? FileType.UNKNOWN : d(bArr, i10, 255, 216, 255) ? FileType.IMAGE : d(bArr, i10, Opcodes.L2F, 80, 78, 71) ? FileType.IMAGE : d(bArr, i10, 71, 73, 70, 56) ? FileType.IMAGE : d(bArr, i10, 66, 77) ? FileType.IMAGE : (d(bArr, i10, 73, 73, 42, 0) || d(bArr, i10, 77, 77, 0, 42)) ? FileType.IMAGE : c(bArr, i10, 0, 'R', 'I', 'F', 'F') ? c(bArr, i10, 8, 'W', 'E', 'B', 'P') ? FileType.IMAGE : c(bArr, i10, 8, 'W', f.f101688t, f.f101678j, 'E') ? FileType.AUDIO : c(bArr, i10, 8, f.f101688t, f.f101678j, 'I', ' ') ? FileType.VIDEO : FileType.UNKNOWN : c(bArr, i10, 4, 'f', f.f101685q, 'y', 'p') ? b(bArr, i10) : d(bArr, i10, 26, 69, 223, Opcodes.IF_ICMPGT) ? FileType.VIDEO : (d(bArr, i10, 0, 0, 1, Opcodes.INVOKEDYNAMIC) || d(bArr, i10, 0, 0, 1, Opcodes.PUTSTATIC)) ? FileType.VIDEO : (c(bArr, i10, 0, 'F', f.f101674f, f.f101678j) && bArr[3] == 1) ? FileType.VIDEO : c(bArr, i10, 0, 'I', 'D', '3') ? FileType.AUDIO : ((bArr[0] & 255) == 255 && (bArr[1] & 224) == 224) ? FileType.AUDIO : (c(bArr, i10, 0, 'O', 'g', 'g', f.f101682n) || c(bArr, i10, 0, 'f', f.f101674f, f.f101687s, f.f101680l)) ? FileType.AUDIO : FileType.UNKNOWN;
    }

    @NonNull
    public static FileType b(@NonNull byte[] bArr, int i10) {
        if (i10 < 12) {
            return FileType.UNKNOWN;
        }
        String str = new String(new char[]{(char) (bArr[8] & 255), (char) (bArr[9] & 255), (char) (bArr[10] & 255), (char) (bArr[11] & 255)});
        return (str.startsWith("hei") || str.startsWith("hev") || str.startsWith("mif") || str.startsWith("msf") || str.startsWith("avi")) ? FileType.IMAGE : str.startsWith("M4A") ? FileType.AUDIO : FileType.VIDEO;
    }

    public static boolean c(@NonNull byte[] bArr, int i10, int i11, char... cArr) {
        if (i10 < cArr.length + i11) {
            return false;
        }
        for (int i12 = 0; i12 < cArr.length; i12++) {
            if ((bArr[i11 + i12] & 255) != cArr[i12]) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(@NonNull byte[] bArr, int i10, int... iArr) {
        if (i10 < iArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if ((bArr[i11] & 255) != iArr[i11]) {
                return false;
            }
        }
        return true;
    }
}
