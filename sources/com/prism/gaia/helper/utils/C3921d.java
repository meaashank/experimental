package com.prism.gaia.helper.utils;

import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: com.prism.gaia.helper.utils.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C3921d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f165108a = "asdf-".concat(C3921d.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f165109b = -1234;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f165110c = -1235;

    /* JADX INFO: renamed from: com.prism.gaia.helper.utils.d$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InputStream f165111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public StringBuffer f165112b = new StringBuffer();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Thread f165113c = new C0672a();

        /* JADX INFO: renamed from: com.prism.gaia.helper.utils.d$a$a, reason: collision with other inner class name */
        public class C0672a extends Thread {
            public C0672a() {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                super.run();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(a.this.f165111a));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            return;
                        } else {
                            a.this.f165112b.append(line);
                        }
                    } catch (IOException e10) {
                        Log.e(C3921d.f165108a, "read stream error:", e10);
                        return;
                    }
                }
            }
        }

        public a(InputStream inputStream) {
            this.f165111a = inputStream;
        }

        public StringBuffer c() {
            return this.f165112b;
        }

        public void d() {
            this.f165113c.start();
        }
    }

    /* JADX INFO: renamed from: com.prism.gaia.helper.utils.d$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f165115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f165116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f165117c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Throwable f165118d;

        public b(int i10, String str, String str2, Throwable th) {
            this.f165115a = i10;
            this.f165116b = str;
            this.f165117c = str2;
            this.f165118d = th;
        }

        public String a() {
            return this.f165117c;
        }

        public Throwable b() {
            return this.f165118d;
        }

        public int c() {
            return this.f165115a;
        }

        public String d() {
            return this.f165116b;
        }

        public boolean e() {
            return this.f165115a == 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.prism.gaia.helper.utils.C3921d.b b(java.util.List<java.lang.String> r4, boolean r5, boolean r6) throws java.io.IOException {
        /*
            java.lang.ProcessBuilder r0 = new java.lang.ProcessBuilder
            r0.<init>(r4)
            java.lang.Process r4 = r0.start()
            r0 = 0
            if (r5 == 0) goto L19
            com.prism.gaia.helper.utils.d$a r5 = new com.prism.gaia.helper.utils.d$a
            java.io.InputStream r1 = r4.getInputStream()
            r5.<init>(r1)
            r5.d()
            goto L1a
        L19:
            r5 = r0
        L1a:
            if (r6 == 0) goto L29
            com.prism.gaia.helper.utils.d$a r6 = new com.prism.gaia.helper.utils.d$a
            java.io.InputStream r1 = r4.getErrorStream()
            r6.<init>(r1)
            r6.d()
            goto L2a
        L29:
            r6 = r0
        L2a:
            int r4 = r4.waitFor()     // Catch: java.lang.Throwable -> L39 java.lang.InterruptedException -> L3c
            if (r5 == 0) goto L3f
            java.lang.StringBuffer r1 = r5.c()     // Catch: java.lang.Throwable -> L39 java.lang.InterruptedException -> L3c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L39 java.lang.InterruptedException -> L3c
            goto L40
        L39:
            r4 = move-exception
            r2 = r0
            goto L5e
        L3c:
            r4 = move-exception
            r2 = r0
            goto L7a
        L3f:
            r1 = r0
        L40:
            if (r6 == 0) goto L53
            java.lang.StringBuffer r2 = r6.c()     // Catch: java.lang.Throwable -> L4b java.lang.InterruptedException -> L4f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4b java.lang.InterruptedException -> L4f
            goto L54
        L4b:
            r4 = move-exception
            r2 = r0
        L4d:
            r0 = r1
            goto L5e
        L4f:
            r4 = move-exception
            r2 = r0
        L51:
            r0 = r1
            goto L7a
        L53:
            r2 = r0
        L54:
            com.prism.gaia.helper.utils.d$b r3 = new com.prism.gaia.helper.utils.d$b     // Catch: java.lang.Throwable -> L5a java.lang.InterruptedException -> L5c
            r3.<init>(r4, r1, r2, r0)     // Catch: java.lang.Throwable -> L5a java.lang.InterruptedException -> L5c
            return r3
        L5a:
            r4 = move-exception
            goto L4d
        L5c:
            r4 = move-exception
            goto L51
        L5e:
            if (r5 == 0) goto L68
            java.lang.StringBuffer r5 = r5.c()
            java.lang.String r0 = r5.toString()
        L68:
            if (r6 == 0) goto L72
            java.lang.StringBuffer r5 = r6.c()
            java.lang.String r2 = r5.toString()
        L72:
            com.prism.gaia.helper.utils.d$b r5 = new com.prism.gaia.helper.utils.d$b
            r6 = -1235(0xfffffffffffffb2d, float:NaN)
            r5.<init>(r6, r0, r2, r4)
            return r5
        L7a:
            if (r5 == 0) goto L84
            java.lang.StringBuffer r5 = r5.c()
            java.lang.String r0 = r5.toString()
        L84:
            if (r6 == 0) goto L8e
            java.lang.StringBuffer r5 = r6.c()
            java.lang.String r2 = r5.toString()
        L8e:
            com.prism.gaia.helper.utils.d$b r5 = new com.prism.gaia.helper.utils.d$b
            r6 = -1234(0xfffffffffffffb2e, float:NaN)
            r5.<init>(r6, r0, r2, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.helper.utils.C3921d.b(java.util.List, boolean, boolean):com.prism.gaia.helper.utils.d$b");
    }
}
