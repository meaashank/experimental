package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.mbridge.msdk.MBridgeConstans;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static q f137527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f137528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f137529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f137530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f137531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f137532f = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f137535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f137536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private File f137537c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private JSONObject f137538d;

        public /* synthetic */ a(File file, byte b10) {
            this(file);
        }

        public static /* synthetic */ void d(a aVar) {
            aVar.f137537c.delete();
        }

        private a(File file) {
            this.f137538d = null;
            this.f137537c = file;
            String[] strArrSplit = file.getName().split("-|\\.");
            if (strArrSplit.length >= 2) {
                this.f137535a = Long.parseLong(strArrSplit[0]);
                this.f137536b = Long.parseLong(strArrSplit[1]);
                return;
            }
            String name = file.getName();
            if (TextUtils.isEmpty(name) || name.length() < 13) {
                return;
            }
            String strSubstring = name.substring(0, 13);
            if (TextUtils.isDigitsOnly(strSubstring)) {
                long j10 = Long.parseLong(strSubstring);
                this.f137535a = j10;
                this.f137536b = j10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JSONObject a() {
            if (this.f137538d == null) {
                try {
                    this.f137538d = new JSONObject(com.apm.insight.l.f.a(this.f137537c.getAbsolutePath(), "\n"));
                } catch (Throwable unused) {
                }
                if (this.f137538d == null) {
                    this.f137538d = new JSONObject();
                }
            }
            return this.f137538d;
        }

        public static /* synthetic */ boolean a(a aVar, long j10) {
            long j11 = aVar.f137535a;
            if (j11 > j10 && j11 - j10 > com.prism.gaia.client.stub.n.f164456n) {
                return true;
            }
            long j12 = aVar.f137536b;
            if (j12 >= j10 || j10 - j12 <= com.prism.gaia.client.stub.n.f164456n) {
                return aVar.f137537c.lastModified() < j10 && j10 - aVar.f137537c.lastModified() > com.prism.gaia.client.stub.n.f164456n;
            }
            return true;
        }
    }

    private q(Context context) {
        File fileC = com.apm.insight.l.j.c(context);
        if (!fileC.exists() || (!fileC.isDirectory() && fileC.delete())) {
            fileC.mkdirs();
            com.apm.insight.runtime.a.b.a();
        }
        this.f137528b = fileC;
        this.f137529c = new File(fileC, "did");
        this.f137530d = new File(fileC, "device_uuid");
        this.f137531e = context;
    }

    public static q a() {
        if (f137527a == null) {
            f137527a = new q(com.apm.insight.e.g());
        }
        return f137527a;
    }

    public final String b() {
        try {
            return com.apm.insight.l.f.a(this.f137529c.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
    }

    public final String c() {
        try {
            return com.apm.insight.l.f.a(this.f137530d.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return null;
        }
    }

    private ArrayList<a> c(final String str) {
        File[] fileArrListFiles = this.f137528b.listFiles(new FilenameFilter() { // from class: com.apm.insight.runtime.q.1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.endsWith(str) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str2).matches();
            }
        });
        ArrayList<a> arrayList = new ArrayList<>();
        if (fileArrListFiles != null) {
            com.apm.insight.a.a((Object) ("foundRuntimeContextFiles " + fileArrListFiles.length));
            byte b10 = 0;
            a aVar = null;
            for (File file : fileArrListFiles) {
                try {
                    a aVar2 = new a(file, b10);
                    arrayList.add(aVar2);
                    if (this.f137532f == null && ".ctx".equals(str) && (aVar == null || aVar2.f137536b >= aVar.f137536b)) {
                        aVar = aVar2;
                    }
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    k.a(th, "NPTH_CATCH");
                }
            }
            if (this.f137532f == null && aVar != null) {
                this.f137532f = aVar;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.util.Map<java.lang.String, java.lang.Object> r10, org.json.JSONArray r11) {
        /*
            r9 = this;
            android.content.Context r0 = r9.f137531e
            com.apm.insight.entity.Header r0 = com.apm.insight.entity.Header.a(r0)
            org.json.JSONObject r6 = r0.a(r10)
            boolean r10 = com.apm.insight.entity.Header.c(r6)
            if (r10 == 0) goto L13
            r1 = r9
            goto La8
        L13:
            long r2 = java.lang.System.currentTimeMillis()
            com.apm.insight.runtime.q$a r10 = r9.f137532f
            if (r10 != 0) goto L20
            java.lang.String r10 = ".ctx"
            r9.c(r10)
        L20:
            com.apm.insight.runtime.q$a r10 = r9.f137532f
            if (r10 != 0) goto L2b
            r4 = r2
            r1 = r9
            r7 = r11
            r1.a(r2, r4, r6, r7)
            return
        L2b:
            r7 = r11
            org.json.JSONObject r11 = com.apm.insight.runtime.q.a.a(r10)
            boolean r0 = com.apm.insight.entity.Header.c(r11)
            r8 = 0
            r1 = 2
            r4 = 1
            if (r0 != 0) goto L61
            boolean r0 = com.apm.insight.entity.Header.c(r6)
            if (r0 == 0) goto L41
            r11 = r8
            goto L62
        L41:
            java.lang.String r0 = "update_version_code"
            java.lang.Object r5 = r6.opt(r0)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object r0 = r11.opt(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L61
            boolean r11 = com.apm.insight.entity.Header.d(r11)
            if (r11 == 0) goto L61
            r11 = r4
            goto L62
        L61:
            r11 = r1
        L62:
            if (r11 == r4) goto L6e
            if (r11 == r1) goto L68
            r1 = r9
            goto L7f
        L68:
            r4 = r2
            r1 = r9
            r1.a(r2, r4, r6, r7)
            goto L7f
        L6e:
            r4 = r2
            long r2 = com.apm.insight.runtime.q.a.b(r10)
            r1 = r9
            r1.a(r2, r4, r6, r7)
            r2 = r4
            java.io.File r10 = com.apm.insight.runtime.q.a.c(r10)
            com.apm.insight.l.f.a(r10)
        L7f:
            java.lang.String r10 = ""
            java.util.ArrayList r10 = r9.c(r10)     // Catch: java.lang.Throwable -> La5
            int r11 = r10.size()     // Catch: java.lang.Throwable -> La5
            r0 = 6
            if (r11 > r0) goto L8d
            goto La8
        L8d:
            int r11 = r10.size()     // Catch: java.lang.Throwable -> La5
        L91:
            if (r8 >= r11) goto La8
            java.lang.Object r0 = r10.get(r8)     // Catch: java.lang.Throwable -> La5
            int r8 = r8 + 1
            com.apm.insight.runtime.q$a r0 = (com.apm.insight.runtime.q.a) r0     // Catch: java.lang.Throwable -> La5
            boolean r4 = com.apm.insight.runtime.q.a.a(r0, r2)     // Catch: java.lang.Throwable -> La5
            if (r4 == 0) goto L91
            com.apm.insight.runtime.q.a.d(r0)     // Catch: java.lang.Throwable -> La5
            goto L91
        La5:
            r0 = move-exception
            r10 = r0
            goto La9
        La8:
            return
        La9:
            com.apm.insight.c.a()
            java.lang.String r11 = "NPTH_CATCH"
            com.apm.insight.runtime.k.a(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.q.a(java.util.Map, org.json.JSONArray):void");
    }

    public final void b(String str) {
        try {
            com.apm.insight.l.f.a(this.f137530d, str, false);
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final JSONArray b(long j10) {
        File file;
        String strA;
        ArrayList<a> arrayListC = c(".allData");
        int size = arrayListC.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                file = null;
                break;
            }
            a aVar = arrayListC.get(i11);
            i11++;
            a aVar2 = aVar;
            if (j10 >= aVar2.f137535a && j10 <= aVar2.f137536b) {
                file = aVar2.f137537c;
                break;
            }
        }
        if (file == null) {
            ArrayList<a> arrayListC2 = c(".allData");
            int size2 = arrayListC2.size();
            a aVar3 = null;
            while (i10 < size2) {
                a aVar4 = arrayListC2.get(i10);
                i10++;
                a aVar5 = aVar4;
                if (aVar3 == null || Math.abs(aVar3.f137536b - j10) > Math.abs(aVar5.f137536b - j10)) {
                    aVar3 = aVar5;
                }
            }
            file = aVar3 == null ? null : aVar3.f137537c;
        }
        if (file != null) {
            try {
                strA = com.apm.insight.l.f.a(file.getAbsolutePath(), "\n");
                try {
                    return new JSONArray(strA);
                } catch (Throwable th) {
                    th = th;
                    com.apm.insight.c.a();
                    k.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                strA = null;
            }
        }
        return null;
    }

    private void a(long j10, long j11, JSONObject jSONObject, JSONArray jSONArray) {
        File file = new File(this.f137528b, j10 + com.prism.gaia.download.a.f164606q + j11 + ".ctx");
        File file2 = new File(this.f137528b, j10 + com.prism.gaia.download.a.f164606q + j11 + ".allData");
        try {
            com.apm.insight.l.f.a(file, jSONObject);
            com.apm.insight.l.f.a(file2, jSONArray);
            this.f137532f = new a(file, (byte) 0);
        } catch (IOException e10) {
            com.apm.insight.c.a();
            k.a(e10, "NPTH_CATCH");
        }
    }

    public final void a(String str) {
        try {
            com.apm.insight.l.f.a(this.f137529c, str, false);
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final JSONObject a(long j10) {
        JSONObject jSONObject;
        File file;
        String strA;
        ArrayList<a> arrayListC = c(".ctx");
        int size = arrayListC.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            jSONObject = null;
            if (i11 >= size) {
                file = null;
                break;
            }
            a aVar = arrayListC.get(i11);
            i11++;
            a aVar2 = aVar;
            if (j10 >= aVar2.f137535a && j10 <= aVar2.f137536b) {
                file = aVar2.f137537c;
                break;
            }
        }
        if (file == null) {
            ArrayList<a> arrayListC2 = c(".ctx");
            int size2 = arrayListC2.size();
            a aVar3 = null;
            while (i10 < size2) {
                a aVar4 = arrayListC2.get(i10);
                i10++;
                a aVar5 = aVar4;
                if (aVar3 == null || Math.abs(aVar3.f137536b - j10) > Math.abs(aVar5.f137536b - j10)) {
                    aVar3 = aVar5;
                }
            }
            file = aVar3 == null ? null : aVar3.f137537c;
            i10 = 1;
        }
        if (file != null) {
            try {
                strA = com.apm.insight.l.f.a(file.getAbsolutePath(), "\n");
                try {
                    jSONObject = new JSONObject(strA);
                } catch (Throwable th) {
                    th = th;
                    com.apm.insight.c.a();
                    k.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
                }
            } catch (Throwable th2) {
                th = th2;
                strA = null;
            }
        }
        if (jSONObject != null && i10 != 0) {
            try {
                jSONObject.put("unauthentic_version", 1);
            } catch (JSONException e10) {
                com.apm.insight.c.a();
                k.a(e10, "NPTH_CATCH");
            }
        }
        return jSONObject;
    }
}
