package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.c;
import androidx.emoji2.text.f;
import e.D;
import e.InterfaceC4330d;
import e.T;
import java.util.Arrays;
import java.util.Set;
import q1.h;
import q1.m;
import q1.q;

/* JADX INFO: loaded from: classes2.dex */
@T(19)
@InterfaceC4330d
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f113313f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f113314g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f113315h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f113316i = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final c.m f113317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final androidx.emoji2.text.f f113318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public c.f f113319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f113320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final int[] f113321e;

    @T(19)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f113322a = -1;

        public static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        return z10 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z10 = true;
                    }
                }
                return i10;
            }
        }

        public static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (i10 >= length) {
                        if (z10) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                        i10++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                        i10++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i10++;
                        z10 = true;
                    }
                }
                return i10;
            }
        }
    }

    public static class b implements c<q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public q f113323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.m f113324b;

        public b(@Nullable q qVar, c.m mVar) {
            this.f113323a = qVar;
            this.f113324b = mVar;
        }

        @Override // androidx.emoji2.text.d.c
        public boolean a(@NonNull CharSequence charSequence, int i10, int i11, m mVar) {
            if (mVar.m()) {
                return true;
            }
            if (this.f113323a == null) {
                this.f113323a = new q(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f113323a.setSpan(this.f113324b.a(mVar), i10, i11, 33);
            return true;
        }

        @Override // androidx.emoji2.text.d.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q getResult() {
            return this.f113323a;
        }
    }

    public interface c<T> {
        boolean a(@NonNull CharSequence charSequence, int i10, int i11, m mVar);

        T getResult();
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$d, reason: collision with other inner class name */
    public static class C0299d implements c<C0299d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f113325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f113326b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f113327c = -1;

        public C0299d(int i10) {
            this.f113325a = i10;
        }

        @Override // androidx.emoji2.text.d.c
        public boolean a(@NonNull CharSequence charSequence, int i10, int i11, m mVar) {
            int i12 = this.f113325a;
            if (i10 > i12 || i12 >= i11) {
                return i11 <= i12;
            }
            this.f113326b = i10;
            this.f113327c = i11;
            return false;
        }

        @Override // androidx.emoji2.text.d.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0299d getResult() {
            return this;
        }
    }

    public static class e implements c<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f113328a;

        public e(String str) {
            this.f113328a = str;
        }

        @Override // androidx.emoji2.text.d.c
        public boolean a(@NonNull CharSequence charSequence, int i10, int i11, m mVar) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f113328a)) {
                return true;
            }
            mVar.o(true);
            return false;
        }

        @Override // androidx.emoji2.text.d.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e getResult() {
            return this;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f113329i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f113330j = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f113331a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f.a f113332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f.a f113333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public f.a f113334d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f113335e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f113336f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f113337g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int[] f113338h;

        public f(f.a aVar, boolean z10, int[] iArr) {
            this.f113332b = aVar;
            this.f113333c = aVar;
            this.f113337g = z10;
            this.f113338h = iArr;
        }

        public static boolean d(int i10) {
            return i10 == 65039;
        }

        public static boolean f(int i10) {
            return i10 == 65038;
        }

        public int a(int i10) {
            f.a aVarA = this.f113333c.a(i10);
            int i11 = 1;
            int i12 = 2;
            if (this.f113331a == 2) {
                if (aVarA != null) {
                    this.f113333c = aVarA;
                    this.f113336f++;
                } else if (f(i10)) {
                    g();
                } else if (!d(i10)) {
                    f.a aVar = this.f113333c;
                    if (aVar.f113362b != null) {
                        i12 = 3;
                        if (this.f113336f != 1) {
                            this.f113334d = aVar;
                            g();
                        } else if (h()) {
                            this.f113334d = this.f113333c;
                            g();
                        } else {
                            g();
                        }
                    } else {
                        g();
                    }
                }
                i11 = i12;
            } else if (aVarA == null) {
                g();
            } else {
                this.f113331a = 2;
                this.f113333c = aVarA;
                this.f113336f = 1;
                i11 = i12;
            }
            this.f113335e = i10;
            return i11;
        }

        public m b() {
            return this.f113333c.f113362b;
        }

        public m c() {
            return this.f113334d.f113362b;
        }

        public boolean e() {
            if (this.f113331a != 2 || this.f113333c.f113362b == null) {
                return false;
            }
            return this.f113336f > 1 || h();
        }

        public final int g() {
            this.f113331a = 1;
            this.f113333c = this.f113332b;
            this.f113336f = 0;
            return 1;
        }

        public final boolean h() {
            if (this.f113333c.f113362b.l() || d(this.f113335e)) {
                return true;
            }
            if (this.f113337g) {
                if (this.f113338h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f113338h, this.f113333c.f113362b.b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public d(@NonNull androidx.emoji2.text.f fVar, @NonNull c.m mVar, @NonNull c.f fVar2, boolean z10, @Nullable int[] iArr, @NonNull Set<int[]> set) {
        this.f113317a = mVar;
        this.f113318b = fVar;
        this.f113319c = fVar2;
        this.f113320d = z10;
        this.f113321e = iArr;
        k(set);
    }

    public static boolean a(@NonNull Editable editable, @NonNull KeyEvent keyEvent, boolean z10) {
        h[] hVarArr;
        if (j(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!i(selectionStart, selectionEnd) && (hVarArr = (h[]) editable.getSpans(selectionStart, selectionEnd, h.class)) != null && hVarArr.length > 0) {
            for (h hVar : hVarArr) {
                int spanStart = editable.getSpanStart(hVar);
                int spanEnd = editable.getSpanEnd(hVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(@NonNull InputConnection inputConnection, @NonNull Editable editable, @D(from = 0) int i10, @D(from = 0) int i11, boolean z10) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (i(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                iMax = a.a(editable, selectionStart, Math.max(i10, 0));
                iMin = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i10, 0);
                iMin = Math.min(selectionEnd + i11, editable.length());
            }
            h[] hVarArr = (h[]) editable.getSpans(iMax, iMin, h.class);
            if (hVarArr != null && hVarArr.length > 0) {
                for (h hVar : hVarArr) {
                    int spanStart = editable.getSpanStart(hVar);
                    int spanEnd = editable.getSpanEnd(hVar);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public static boolean g(@NonNull Editable editable, int i10, @NonNull KeyEvent keyEvent) {
        if (!(i10 != 67 ? i10 != 112 ? false : a(editable, keyEvent, true) : a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    public static boolean i(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    public static boolean j(@NonNull KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public int b(@NonNull CharSequence charSequence, @D(from = 0) int i10) {
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            h[] hVarArr = (h[]) spanned.getSpans(i10, i10 + 1, h.class);
            if (hVarArr.length > 0) {
                return spanned.getSpanEnd(hVarArr[0]);
            }
        }
        return ((C0299d) m(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new C0299d(i10))).f113327c;
    }

    public int c(@NonNull CharSequence charSequence) {
        return d(charSequence, this.f113318b.f113357a.S());
    }

    public int d(@NonNull CharSequence charSequence, int i10) {
        f fVar = new f(this.f113318b.f113359c, this.f113320d, this.f113321e);
        int length = charSequence.length();
        int iCharCount = 0;
        int i11 = 0;
        int i12 = 0;
        while (iCharCount < length) {
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            int iA = fVar.a(iCodePointAt);
            m mVar = fVar.f113333c.f113362b;
            if (iA == 1) {
                iCharCount += Character.charCount(iCodePointAt);
                i12 = 0;
            } else if (iA == 2) {
                iCharCount += Character.charCount(iCodePointAt);
            } else if (iA == 3) {
                mVar = fVar.f113334d.f113362b;
                if (mVar.d() <= i10) {
                    i11++;
                }
            }
            if (mVar != null && mVar.d() <= i10) {
                i12++;
            }
        }
        if (i11 != 0) {
            return 2;
        }
        if (!fVar.e() || fVar.f113333c.f113362b.d() > i10) {
            return i12 == 0 ? 0 : 2;
        }
        return 1;
    }

    public int e(@NonNull CharSequence charSequence, @D(from = 0) int i10) {
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            h[] hVarArr = (h[]) spanned.getSpans(i10, i10 + 1, h.class);
            if (hVarArr.length > 0) {
                return spanned.getSpanStart(hVarArr[0]);
            }
        }
        return ((C0299d) m(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new C0299d(i10))).f113326b;
    }

    public final boolean h(CharSequence charSequence, int i10, int i11, m mVar) {
        if (mVar.e() == 0) {
            mVar.p(this.f113319c.a(charSequence, i10, i11, mVar.i()));
        }
        return mVar.e() == 2;
    }

    public final void k(@NonNull Set<int[]> set) {
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr : set) {
            String str = new String(iArr, 0, iArr.length);
            m(str, 0, str.length(), 1, true, new e(str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c A[Catch: all -> 0x002a, TRY_ENTER, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:69:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:69:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[Catch: all -> 0x00b0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:35:0x0069, B:44:0x0085, B:19:0x0031), top: B:65:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.CharSequence l(@androidx.annotation.NonNull java.lang.CharSequence r11, @e.D(from = 0) int r12, @e.D(from = 0) int r13, @e.D(from = 0) int r14, boolean r15) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r1 = r11 instanceof q1.l
            if (r1 == 0) goto La
            r0 = r11
            q1.l r0 = (q1.l) r0
            r0.b()
        La:
            java.lang.Class<q1.h> r0 = q1.h.class
            if (r1 != 0) goto L31
            boolean r2 = r11 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L13
            goto L31
        L13:
            boolean r2 = r11 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2f
            r2 = r11
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch: java.lang.Throwable -> L2a
            int r3 = r12 + (-1)
            int r4 = r13 + 1
            int r2 = r2.nextSpanTransition(r3, r4, r0)     // Catch: java.lang.Throwable -> L2a
            if (r2 > r13) goto L2f
            q1.q r2 = new q1.q     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L2a
            goto L39
        L2a:
            r0 = move-exception
            r12 = r0
            r3 = r11
            goto Lb7
        L2f:
            r2 = 0
            goto L39
        L31:
            q1.q r2 = new q1.q     // Catch: java.lang.Throwable -> Lb0
            r3 = r11
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch: java.lang.Throwable -> Lb0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lb0
        L39:
            r3 = 0
            if (r2 == 0) goto L65
            java.lang.Object[] r4 = r2.getSpans(r12, r13, r0)     // Catch: java.lang.Throwable -> L2a
            q1.h[] r4 = (q1.h[]) r4     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L65
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            if (r5 <= 0) goto L65
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            r6 = r3
        L49:
            if (r6 >= r5) goto L65
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L2a
            int r8 = r2.getSpanStart(r7)     // Catch: java.lang.Throwable -> L2a
            int r9 = r2.getSpanEnd(r7)     // Catch: java.lang.Throwable -> L2a
            if (r8 == r13) goto L5a
            r2.removeSpan(r7)     // Catch: java.lang.Throwable -> L2a
        L5a:
            int r12 = java.lang.Math.min(r8, r12)     // Catch: java.lang.Throwable -> L2a
            int r13 = java.lang.Math.max(r9, r13)     // Catch: java.lang.Throwable -> L2a
            int r6 = r6 + 1
            goto L49
        L65:
            r4 = r12
            r5 = r13
            if (r4 == r5) goto L6f
            int r12 = r11.length()     // Catch: java.lang.Throwable -> Lb0
            if (r4 < r12) goto L71
        L6f:
            r3 = r11
            goto Lb3
        L71:
            r12 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r12) goto L84
            if (r2 == 0) goto L84
            int r12 = r2.length()     // Catch: java.lang.Throwable -> L2a
            java.lang.Object[] r12 = r2.getSpans(r3, r12, r0)     // Catch: java.lang.Throwable -> L2a
            q1.h[] r12 = (q1.h[]) r12     // Catch: java.lang.Throwable -> L2a
            int r12 = r12.length     // Catch: java.lang.Throwable -> L2a
            int r14 = r14 - r12
        L84:
            r6 = r14
            androidx.emoji2.text.d$b r8 = new androidx.emoji2.text.d$b     // Catch: java.lang.Throwable -> Lb0
            androidx.emoji2.text.c$m r12 = r10.f113317a     // Catch: java.lang.Throwable -> Lb0
            r8.<init>(r2, r12)     // Catch: java.lang.Throwable -> Lb0
            r2 = r10
            r3 = r11
            r7 = r15
            java.lang.Object r11 = r2.m(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> La4
            q1.q r11 = (q1.q) r11     // Catch: java.lang.Throwable -> La4
            if (r11 == 0) goto La7
            android.text.Spannable r11 = r11.b()     // Catch: java.lang.Throwable -> La4
            if (r1 == 0) goto La3
            r12 = r3
            q1.l r12 = (q1.l) r12
            r12.d()
        La3:
            return r11
        La4:
            r0 = move-exception
        La5:
            r12 = r0
            goto Lb7
        La7:
            if (r1 == 0) goto Laf
        La9:
            r11 = r3
            q1.l r11 = (q1.l) r11
            r11.d()
        Laf:
            return r3
        Lb0:
            r0 = move-exception
            r3 = r11
            goto La5
        Lb3:
            if (r1 == 0) goto Lb6
            goto La9
        Lb6:
            return r3
        Lb7:
            if (r1 == 0) goto Lbf
            r11 = r3
            q1.l r11 = (q1.l) r11
            r11.d()
        Lbf:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.d.l(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }

    public final <T> T m(@NonNull CharSequence charSequence, @D(from = 0) int i10, @D(from = 0) int i11, @D(from = 0) int i12, boolean z10, c<T> cVar) {
        int i13;
        f fVar = new f(this.f113318b.f113359c, this.f113320d, this.f113321e);
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        int i14 = 0;
        boolean zA = true;
        loop0: while (true) {
            int iCodePointAt2 = iCodePointAt;
            while (true) {
                i13 = i10;
                while (i10 < i11 && i14 < i12 && zA) {
                    int iA = fVar.a(iCodePointAt2);
                    if (iA == 1) {
                        i10 = Character.charCount(Character.codePointAt(charSequence, i13)) + i13;
                        if (i10 < i11) {
                            break;
                        }
                    } else if (iA == 2) {
                        int iCharCount = Character.charCount(iCodePointAt2) + i10;
                        if (iCharCount < i11) {
                            iCodePointAt2 = Character.codePointAt(charSequence, iCharCount);
                        }
                        i10 = iCharCount;
                    } else if (iA == 3) {
                        if (z10 || !h(charSequence, i13, i10, fVar.f113334d.f113362b)) {
                            zA = cVar.a(charSequence, i13, i10, fVar.f113334d.f113362b);
                            i14++;
                        }
                    }
                }
                break loop0;
            }
            iCodePointAt = Character.codePointAt(charSequence, i10);
        }
        if (fVar.e() && i14 < i12 && zA && (z10 || !h(charSequence, i13, i10, fVar.f113333c.f113362b))) {
            cVar.a(charSequence, i13, i10, fVar.f113333c.f113362b);
        }
        return cVar.getResult();
    }
}
