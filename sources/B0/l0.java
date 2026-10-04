package b0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f120653a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f120654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static Constructor<StaticLayout> f120655c;

    public static final class a {
        public a() {
        }

        public final Constructor<StaticLayout> b() {
            if (l0.f120654b) {
                return l0.f120655c;
            }
            l0.f120654b = true;
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                l0.f120655c = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            } catch (NoSuchMethodException unused) {
                l0.f120655c = null;
                Log.e(n0.f120657a, "unable to collect necessary constructor.");
            }
            return l0.f120655c;
        }

        public a(C4969v c4969v) {
        }
    }

    @Override // b0.m0
    public boolean a(@NotNull StaticLayout staticLayout, boolean z10) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    @Override // b0.m0
    @e.InterfaceC4345t
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.text.StaticLayout b(@org.jetbrains.annotations.NotNull b0.o0 r21) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "unable to call constructor"
            java.lang.String r2 = "StaticLayoutFactory"
            b0.l0$a r3 = b0.l0.f120653a
            java.lang.reflect.Constructor r3 = r3.b()
            if (r3 == 0) goto La2
            java.lang.CharSequence r5 = r0.f120658a     // Catch: java.lang.reflect.InvocationTargetException -> L87 java.lang.InstantiationException -> L8a java.lang.IllegalAccessException -> L8d
            int r6 = r0.f120659b     // Catch: java.lang.reflect.InvocationTargetException -> L87 java.lang.InstantiationException -> L8a java.lang.IllegalAccessException -> L8d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L87 java.lang.InstantiationException -> L8a java.lang.IllegalAccessException -> L8d
            int r7 = r0.f120660c     // Catch: java.lang.reflect.InvocationTargetException -> L87 java.lang.InstantiationException -> L8a java.lang.IllegalAccessException -> L8d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L87 java.lang.InstantiationException -> L8a java.lang.IllegalAccessException -> L8d
            android.text.TextPaint r8 = r0.f120661d     // Catch: java.lang.reflect.InvocationTargetException -> L87 java.lang.InstantiationException -> L8a java.lang.IllegalAccessException -> L8d
            int r9 = r0.f120662e     // Catch: java.lang.reflect.InvocationTargetException -> L87 java.lang.InstantiationException -> L8a java.lang.IllegalAccessException -> L8d
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.reflect.InvocationTargetException -> L87 java.lang.InstantiationException -> L8a java.lang.IllegalAccessException -> L8d
            android.text.Layout$Alignment r10 = r0.f120664g     // Catch: java.lang.reflect.InvocationTargetException -> L87 java.lang.InstantiationException -> L8a java.lang.IllegalAccessException -> L8d
            android.text.TextDirectionHeuristic r11 = r0.f120663f     // Catch: java.lang.reflect.InvocationTargetException -> L87 java.lang.InstantiationException -> L8a java.lang.IllegalAccessException -> L8d
            float r12 = r0.f120668k     // Catch: java.lang.reflect.InvocationTargetException -> L87 java.lang.InstantiationException -> L8a java.lang.IllegalAccessException -> L8d
            java.lang.Float r12 = java.lang.Float.valueOf(r12)     // Catch: java.lang.reflect.InvocationTargetException -> L87 java.lang.InstantiationException -> L8a java.lang.IllegalAccessException -> L8d
            float r13 = r0.f120669l     // Catch: java.lang.reflect.InvocationTargetException -> L87 java.lang.InstantiationException -> L8a java.lang.IllegalAccessException -> L8d
            java.lang.Float r13 = java.lang.Float.valueOf(r13)     // Catch: java.lang.reflect.InvocationTargetException -> L87 java.lang.InstantiationException -> L8a java.lang.IllegalAccessException -> L8d
            boolean r14 = r0.f120671n     // Catch: java.lang.reflect.InvocationTargetException -> L87 java.lang.InstantiationException -> L8a java.lang.IllegalAccessException -> L8d
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch: java.lang.reflect.InvocationTargetException -> L87 java.lang.InstantiationException -> L8a java.lang.IllegalAccessException -> L8d
            android.text.TextUtils$TruncateAt r15 = r0.f120666i     // Catch: java.lang.reflect.InvocationTargetException -> L87 java.lang.InstantiationException -> L8a java.lang.IllegalAccessException -> L8d
            r16 = 0
            int r4 = r0.f120667j     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.InstantiationException -> L96 java.lang.IllegalAccessException -> L9c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.InstantiationException -> L96 java.lang.IllegalAccessException -> L9c
            r17 = r4
            int r4 = r0.f120665h     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.InstantiationException -> L96 java.lang.IllegalAccessException -> L9c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.InstantiationException -> L96 java.lang.IllegalAccessException -> L9c
            r18 = r4
            r4 = 13
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.InstantiationException -> L96 java.lang.IllegalAccessException -> L9c
            r19 = 0
            r4[r19] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.InstantiationException -> L96 java.lang.IllegalAccessException -> L9c
            r5 = 1
            r4[r5] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.InstantiationException -> L96 java.lang.IllegalAccessException -> L9c
            r5 = 2
            r4[r5] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.InstantiationException -> L96 java.lang.IllegalAccessException -> L9c
            r5 = 3
            r4[r5] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.InstantiationException -> L96 java.lang.IllegalAccessException -> L9c
            r5 = 4
            r4[r5] = r9     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.InstantiationException -> L96 java.lang.IllegalAccessException -> L9c
            r5 = 5
            r4[r5] = r10     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.InstantiationException -> L96 java.lang.IllegalAccessException -> L9c
            r5 = 6
            r4[r5] = r11     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.InstantiationException -> L96 java.lang.IllegalAccessException -> L9c
            r5 = 7
            r4[r5] = r12     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.InstantiationException -> L96 java.lang.IllegalAccessException -> L9c
            r5 = 8
            r4[r5] = r13     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.InstantiationException -> L96 java.lang.IllegalAccessException -> L9c
            r5 = 9
            r4[r5] = r14     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.InstantiationException -> L96 java.lang.IllegalAccessException -> L9c
            r5 = 10
            r4[r5] = r15     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.InstantiationException -> L96 java.lang.IllegalAccessException -> L9c
            r5 = 11
            r4[r5] = r17     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.InstantiationException -> L96 java.lang.IllegalAccessException -> L9c
            r5 = 12
            r4[r5] = r18     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.InstantiationException -> L96 java.lang.IllegalAccessException -> L9c
            java.lang.Object r3 = r3.newInstance(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.InstantiationException -> L96 java.lang.IllegalAccessException -> L9c
            android.text.StaticLayout r3 = (android.text.StaticLayout) r3     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.InstantiationException -> L96 java.lang.IllegalAccessException -> L9c
            r4 = r3
            goto La6
        L87:
            r16 = 0
            goto L90
        L8a:
            r16 = 0
            goto L96
        L8d:
            r16 = 0
            goto L9c
        L90:
            b0.l0.f120655c = r16
            android.util.Log.e(r2, r1)
            goto La4
        L96:
            b0.l0.f120655c = r16
            android.util.Log.e(r2, r1)
            goto La4
        L9c:
            b0.l0.f120655c = r16
            android.util.Log.e(r2, r1)
            goto La4
        La2:
            r16 = 0
        La4:
            r4 = r16
        La6:
            if (r4 == 0) goto La9
            return r4
        La9:
            android.text.StaticLayout r5 = new android.text.StaticLayout
            java.lang.CharSequence r6 = r0.f120658a
            int r7 = r0.f120659b
            int r8 = r0.f120660c
            android.text.TextPaint r9 = r0.f120661d
            int r10 = r0.f120662e
            android.text.Layout$Alignment r11 = r0.f120664g
            float r12 = r0.f120668k
            float r13 = r0.f120669l
            boolean r14 = r0.f120671n
            android.text.TextUtils$TruncateAt r15 = r0.f120666i
            int r0 = r0.f120667j
            r16 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.l0.b(b0.o0):android.text.StaticLayout");
    }
}
