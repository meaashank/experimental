package com.prism.gaia.naked.compat.libcore.io;

import D9.d;
import W6.c;
import androidx.constraintlayout.widget.e;
import com.bykv.vk.openvk.preload.geckox.d.j;
import com.prism.commons.exception.GaiaRuntimeException;
import com.prism.gaia.helper.utils.h;
import com.prism.gaia.helper.utils.l;
import com.prism.gaia.naked.metadata.libcore.io.ForwardingOsCAG;
import com.prism.gaia.naked.metadata.libcore.io.LibcoreCAG;
import com.prism.gaia.naked.metadata.libcore.io.OsCAG;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class OsCompat2 {

    public static class GUtil {
        private static Method chmod;
        private static Method chown;
        private static Method stat;

        public static class StructStat {
            private static Field st_gid;
            private static Field st_mode;
            private static Field st_uid;

            static {
                try {
                    Class<?> returnType = GUtil.stat.getReturnType();
                    Field declaredField = returnType.getDeclaredField("st_uid");
                    st_uid = declaredField;
                    declaredField.setAccessible(true);
                    Field declaredField2 = returnType.getDeclaredField("st_gid");
                    st_gid = declaredField2;
                    declaredField2.setAccessible(true);
                    Field declaredField3 = returnType.getDeclaredField("st_mode");
                    st_mode = declaredField3;
                    declaredField3.setAccessible(true);
                } catch (Throwable th) {
                    throw new IllegalStateException(th);
                }
            }
        }

        static {
            try {
                Method method = OsCAG.f166018G.ORG_CLASS().getMethod("stat", String.class);
                stat = method;
                method.setAccessible(true);
                Class clsORG_CLASS = OsCAG.f166018G.ORG_CLASS();
                Class<?> cls = Integer.TYPE;
                Method method2 = clsORG_CLASS.getMethod("chmod", String.class, cls);
                chmod = method2;
                method2.setAccessible(true);
                Method method3 = OsCAG.f166018G.ORG_CLASS().getMethod("chown", String.class, cls, cls);
                chown = method3;
                method3.setAccessible(true);
            } catch (Throwable th) {
                throw new IllegalStateException(th);
            }
        }
    }

    public static class Util {
        private static final String TAG = "asdf-".concat(Util.class.getSimpleName());
        private static Object os;

        public static void chmod(String str, int i10) throws IOException {
            try {
                if (str.equals(d.p().getAbsolutePath())) {
                    return;
                }
                GUtil.chmod.invoke(getOs(), str, Integer.valueOf(i10));
            } catch (Throwable th) {
                Throwable thA = h.a(th);
                throw new IOException(j.a(thA, e.a("chmod file '", str, "' mode(", i10, ") failed: ")), thA);
            }
        }

        public static void chown(String str, int i10, int i11) throws IOException {
            try {
                GUtil.chown.invoke(getOs(), str, Integer.valueOf(i10), Integer.valueOf(i11));
            } catch (Throwable th) {
                Throwable thA = h.a(th);
                StringBuilder sbA = e.a("chown file '", str, "' uid(", i10, ") gid(");
                sbA.append(i11);
                sbA.append(") failed: ");
                sbA.append(thA.getMessage());
                throw new IOException(sbA.toString(), thA);
            }
        }

        public static void expandModeOfFile(String str, int i10) throws IOException {
            int modeOfFile = getModeOfFile(str);
            if (modeOfFile < 0) {
                return;
            }
            expandModeOfFile(str, modeOfFile, i10);
        }

        public static void fixModeOfFile(String str, int i10, int i11) throws IOException {
            do {
                Object objStat = stat(str);
                if (objStat == null || getUidOfStructStat(objStat) != i11) {
                    return;
                }
                expandModeOfFile(str, getModeOfStructStat(objStat), i10);
                str = new File(str).getParent();
            } while (str != null);
        }

        public static int getGidOfFile(String str) {
            Object objStat = stat(str);
            if (objStat == null) {
                return -1;
            }
            return getGidOfStructStat(objStat);
        }

        public static int getGidOfStructStat(Object obj) {
            try {
                return ((Integer) GUtil.StructStat.st_gid.get(obj)).intValue();
            } catch (Throwable th) {
                Throwable thA = h.a(th);
                Objects.toString(obj);
                throw new SecurityException(thA);
            }
        }

        public static int getModeOfFile(String str) {
            Object objStat = stat(str);
            if (objStat == null) {
                return -1;
            }
            return getModeOfStructStat(objStat);
        }

        public static int getModeOfStructStat(Object obj) {
            try {
                return ((Integer) GUtil.StructStat.st_mode.get(obj)).intValue();
            } catch (Throwable th) {
                Throwable thA = h.a(th);
                Objects.toString(obj);
                throw new SecurityException(thA);
            }
        }

        public static synchronized Object getOs() {
            Object obj;
            try {
                Object obj2 = os;
                if (obj2 != null) {
                    return obj2;
                }
                os = LibcoreCAG.f166017G.os().get();
                if (ForwardingOsCAG.f166016C.os() != null && (obj = ForwardingOsCAG.f166016C.os().get(os)) != null) {
                    os = obj;
                }
                Object obj3 = os;
                if (obj3 != null) {
                    return obj3;
                }
                throw new GaiaRuntimeException("libcore.io.Os instance get failed");
            } catch (Throwable th) {
                throw th;
            }
        }

        public static int getUidOfFile(String str) {
            Object objStat = stat(str);
            if (objStat == null) {
                return -1;
            }
            return getUidOfStructStat(objStat);
        }

        public static int getUidOfStructStat(Object obj) {
            try {
                return ((Integer) GUtil.StructStat.st_uid.get(obj)).intValue();
            } catch (Throwable th) {
                Throwable thA = h.a(th);
                Objects.toString(obj);
                throw new SecurityException(thA);
            }
        }

        public static void setUidOfStructStat(Object obj, int i10) {
            try {
                GUtil.StructStat.st_uid.set(obj, Integer.valueOf(i10));
            } catch (Throwable th) {
                Throwable thA = h.a(th);
                Objects.toString(obj);
                throw new SecurityException(thA);
            }
        }

        public static Object stat(String str) {
            try {
                return GUtil.stat.invoke(getOs(), str);
            } catch (Throwable th) {
                h.a(th).getMessage();
                return null;
            }
        }

        private static void expandModeOfFile(String str, int i10, int i11) throws IOException {
            chmod(str, (i10 & l.b.f165167a) | i11);
        }
    }
}
