package org.apache.commons.io;

import C4.q;
import android.support.v4.media.i;
import androidx.compose.runtime.changelist.j;
import androidx.fragment.app.C2564b;
import androidx.room.F;
import com.android.launcher3.IconCache;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import w.y;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class FileSystemUtils {
    private static final String DF;
    private static final int INIT_PROBLEM = -1;
    private static final FileSystemUtils INSTANCE = new FileSystemUtils();
    private static final int OS;
    private static final int OTHER = 0;
    private static final int POSIX_UNIX = 3;
    private static final int UNIX = 2;
    private static final int WINDOWS = 1;

    static {
        int i10;
        String property;
        String str = "df";
        try {
            property = System.getProperty("os.name");
        } catch (Exception unused) {
            i10 = -1;
        }
        if (property == null) {
            throw new IOException("os.name not found");
        }
        String lowerCase = property.toLowerCase(Locale.ENGLISH);
        if (lowerCase.contains("windows")) {
            i10 = 1;
        } else if (lowerCase.contains("linux") || lowerCase.contains("mpe/ix") || lowerCase.contains("freebsd") || lowerCase.contains("openbsd") || lowerCase.contains("irix") || lowerCase.contains("digital unix") || lowerCase.contains("unix") || lowerCase.contains("mac os x")) {
            i10 = 2;
        } else {
            if (lowerCase.contains("sun os") || lowerCase.contains("sunos") || lowerCase.contains("solaris")) {
                str = "/usr/xpg4/bin/df";
            } else if (!lowerCase.contains("hp-ux") && !lowerCase.contains("aix")) {
                i10 = 0;
            }
            i10 = 3;
        }
        OS = i10;
        DF = str;
    }

    @Deprecated
    public static long freeSpace(String str) throws IOException {
        return INSTANCE.freeSpaceOS(str, OS, false, -1L);
    }

    @Deprecated
    public static long freeSpaceKb(String str) throws IOException {
        return freeSpaceKb(str, -1L);
    }

    public long freeSpaceOS(String str, int i10, boolean z10, long j10) throws Throwable {
        if (str == null) {
            throw new IllegalArgumentException("Path must not be null");
        }
        if (i10 == 0) {
            throw new IllegalStateException("Unsupported operating system");
        }
        if (i10 == 1) {
            long jFreeSpaceWindows = freeSpaceWindows(str, j10);
            return z10 ? jFreeSpaceWindows / 1024 : jFreeSpaceWindows;
        }
        if (i10 == 2) {
            return freeSpaceUnix(str, z10, false, j10);
        }
        if (i10 == 3) {
            return freeSpaceUnix(str, z10, true, j10);
        }
        throw new IllegalStateException("Exception caught when determining operating system");
    }

    public long freeSpaceUnix(String str, boolean z10, boolean z11, long j10) throws Throwable {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Path must not be empty");
        }
        String strA = z10 ? "-k" : com.prism.gaia.download.a.f164606q;
        if (z11) {
            strA = j.a(strA, "P");
        }
        List<String> listPerformCommand = performCommand(strA.length() > 1 ? new String[]{DF, strA, str} : new String[]{DF, str}, 3, j10);
        if (listPerformCommand.size() < 2) {
            StringBuilder sb2 = new StringBuilder("Command line '");
            F.a(sb2, DF, "' did not return info as expected for path '", str, "'- response was ");
            sb2.append(listPerformCommand);
            throw new IOException(sb2.toString());
        }
        StringTokenizer stringTokenizer = new StringTokenizer(listPerformCommand.get(1), q.f17581a);
        if (stringTokenizer.countTokens() >= 4) {
            stringTokenizer.nextToken();
        } else {
            if (stringTokenizer.countTokens() != 1 || listPerformCommand.size() < 3) {
                throw new IOException(C2564b.a(new StringBuilder("Command line '"), DF, "' did not return data as expected for path '", str, "'- check path is valid"));
            }
            stringTokenizer = new StringTokenizer(listPerformCommand.get(2), q.f17581a);
        }
        stringTokenizer.nextToken();
        stringTokenizer.nextToken();
        return parseBytes(stringTokenizer.nextToken(), str);
    }

    public long freeSpaceWindows(String str, long j10) throws Throwable {
        String strNormalize = FilenameUtils.normalize(str, false);
        if (strNormalize == null) {
            throw new IllegalArgumentException(str);
        }
        if (strNormalize.length() > 0 && strNormalize.charAt(0) != '\"') {
            strNormalize = i.a("\"", strNormalize, "\"");
        }
        List<String> listPerformCommand = performCommand(new String[]{"cmd.exe", "/C", y.a("dir /a /-c ", strNormalize)}, Integer.MAX_VALUE, j10);
        for (int size = listPerformCommand.size() - 1; size >= 0; size--) {
            String str2 = listPerformCommand.get(size);
            if (str2.length() > 0) {
                return parseDir(str2, strNormalize);
            }
        }
        throw new IOException(i.a("Command line 'dir /-c' did not return any info for path '", strNormalize, "'"));
    }

    public Process openProcess(String[] strArr) throws IOException {
        return Runtime.getRuntime().exec(strArr);
    }

    public long parseBytes(String str, String str2) throws IOException {
        try {
            long j10 = Long.parseLong(str);
            if (j10 >= 0) {
                return j10;
            }
            throw new IOException("Command line '" + DF + "' did not find free space in response for path '" + str2 + "'- check path is valid");
        } catch (NumberFormatException e10) {
            throw new IOException(C2564b.a(new StringBuilder("Command line '"), DF, "' did not return numeric data as expected for path '", str2, "'- check path is valid"), e10);
        }
    }

    public long parseDir(String str, String str2) throws IOException {
        int i10;
        int i11;
        int i12;
        int length = str.length();
        while (true) {
            length--;
            i10 = 0;
            if (length < 0) {
                i11 = 0;
                break;
            }
            if (Character.isDigit(str.charAt(length))) {
                i11 = length + 1;
                break;
            }
        }
        while (true) {
            if (length < 0) {
                i12 = 0;
                break;
            }
            char cCharAt = str.charAt(length);
            if (!Character.isDigit(cCharAt) && cCharAt != ',' && cCharAt != '.') {
                i12 = length + 1;
                break;
            }
            length--;
        }
        if (length < 0) {
            throw new IOException(i.a("Command line 'dir /-c' did not return valid info for path '", str2, "'"));
        }
        StringBuilder sb2 = new StringBuilder(str.substring(i12, i11));
        while (i10 < sb2.length()) {
            if (sb2.charAt(i10) == ',' || sb2.charAt(i10) == '.') {
                sb2.deleteCharAt(i10);
                i10--;
            }
            i10++;
        }
        return parseBytes(sb2.toString(), str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<java.lang.String> performCommand(java.lang.String[] r11, int r12, long r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.FileSystemUtils.performCommand(java.lang.String[], int, long):java.util.List");
    }

    @Deprecated
    public static long freeSpaceKb(String str, long j10) throws IOException {
        return INSTANCE.freeSpaceOS(str, OS, true, j10);
    }

    @Deprecated
    public static long freeSpaceKb() throws IOException {
        return freeSpaceKb(-1L);
    }

    @Deprecated
    public static long freeSpaceKb(long j10) throws IOException {
        return freeSpaceKb(new File(IconCache.EMPTY_CLASS_NAME).getAbsolutePath(), j10);
    }
}
