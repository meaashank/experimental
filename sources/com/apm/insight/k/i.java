package com.apm.insight.k;

import androidx.room.F;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f137334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HttpURLConnection f137335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f137336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f137337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f137338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private k f137339f;

    public i(String str, String str2, boolean z10) throws IOException {
        this.f137336c = str2;
        this.f137337d = z10;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.f137334a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f137335b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.f137335b.setDoOutput(true);
        this.f137335b.setDoInput(true);
        this.f137335b.setRequestMethod("POST");
        this.f137335b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        if (!z10) {
            this.f137338e = new f(this.f137335b.getOutputStream());
        } else {
            this.f137335b.setRequestProperty("Content-Encoding", "gzip");
            this.f137339f = new k(this.f137335b.getOutputStream());
        }
    }

    public final void a(String str, String str2) {
        b(str, str2);
    }

    public final void b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder("--");
        F.a(sb2, this.f137334a, "\r\nContent-Disposition: form-data; name=\"", str, "\"\r\nContent-Type: text/plain; charset=");
        sb2.append(this.f137336c);
        sb2.append("\r\n\r\n");
        try {
            if (this.f137337d) {
                this.f137339f.write(sb2.toString().getBytes());
            } else {
                this.f137338e.write(sb2.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        try {
            if (this.f137337d) {
                this.f137339f.write(bytes);
                this.f137339f.write("\r\n".getBytes());
            } else {
                this.f137338e.write(bytes);
                this.f137338e.write("\r\n".getBytes());
            }
        } catch (IOException unused2) {
        }
    }

    public final void a(String str, File... fileArr) throws IOException {
        StringBuilder sb2 = new StringBuilder("--");
        F.a(sb2, this.f137334a, "\r\nContent-Disposition: form-data; name=\"", str, "\"; filename=\"");
        sb2.append(str);
        sb2.append("\"\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f137337d) {
            this.f137339f.write(sb2.toString().getBytes());
        } else {
            this.f137338e.write(sb2.toString().getBytes());
        }
        if (this.f137337d) {
            com.apm.insight.l.f.a(this.f137339f, fileArr);
        } else {
            com.apm.insight.l.f.a(this.f137338e, fileArr);
        }
        if (this.f137337d) {
            this.f137339f.write("\r\n".getBytes());
        } else {
            this.f137338e.write("\r\n".getBytes());
            this.f137338e.flush();
        }
    }

    public final void a(String str, File file, Map<String, String> map) throws IOException {
        String name = file.getName();
        StringBuilder sb2 = new StringBuilder("--");
        F.a(sb2, this.f137334a, "\r\nContent-Disposition: form-data; name=\"", str, "\"; filename=\"");
        sb2.append(name);
        sb2.append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb2.append("; ");
            sb2.append(entry.getKey());
            sb2.append("=\"");
            sb2.append(entry.getValue());
            sb2.append("\"");
        }
        sb2.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f137337d) {
            this.f137339f.write(sb2.toString().getBytes());
        } else {
            this.f137338e.write(sb2.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = fileInputStream.read(bArr);
            if (i10 == -1) {
                break;
            } else if (this.f137337d) {
                this.f137339f.write(bArr, 0, i10);
            } else {
                this.f137338e.write(bArr, 0, i10);
            }
        }
        fileInputStream.close();
        if (this.f137337d) {
            this.f137339f.write("\r\n".getBytes());
        } else {
            this.f137338e.write("\r\n".getBytes());
            this.f137338e.flush();
        }
    }

    public final String a() throws IOException {
        ArrayList arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f137334a + "--\r\n").getBytes();
        if (this.f137337d) {
            this.f137339f.write(bytes);
            this.f137339f.b();
            this.f137339f.a();
        } else {
            this.f137338e.write(bytes);
            this.f137338e.flush();
            this.f137338e.a();
        }
        int responseCode = this.f137335b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f137335b.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                arrayList.add(line);
            }
            bufferedReader.close();
            this.f137335b.disconnect();
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                sb2.append((String) obj);
            }
            return sb2.toString();
        }
        throw new IOException("Server returned non-OK status: ".concat(String.valueOf(responseCode)));
    }
}
