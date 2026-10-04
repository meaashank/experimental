package com.inmobi.media;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3652n6 extends W8 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C3540f6 f153189y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3652n6(String url, C3540f6 data) {
        super("POST", url, (C3686pc) null, true, (N4) null, "application/json", 64);
        kotlin.jvm.internal.G.p(url, "url");
        kotlin.jvm.internal.G.p(data, "data");
        this.f153189y = data;
    }

    public static String a(String str) {
        BufferedReader bufferedReader;
        File file = new File(str);
        StringBuilder sb2 = new StringBuilder();
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb2.append(line);
            sb2.append('\n');
            String string = sb2.toString();
            kotlin.jvm.internal.G.o(string, "toString(...)");
            return string;
        }
        bufferedReader.close();
        String string2 = sb2.toString();
        kotlin.jvm.internal.G.o(string2, "toString(...)");
        return string2;
    }

    @Override // com.inmobi.media.W8
    public final void f() {
        super.f();
        this.f152571t = false;
        this.f152572u = false;
        this.f152575x = false;
        try {
            this.f152563l = new JSONObject(a(this.f153189y.f152914a));
        } catch (FileNotFoundException unused) {
            String strA = android.support.v4.media.e.a(new StringBuilder("File - "), this.f153189y.f152914a, " not found");
            X8 x82 = new X8();
            x82.f152598c = new T8(J3.f152113s, strA);
            this.f152565n = x82;
        } catch (IOException unused2) {
            String str = "IOException while reading file - " + this.f153189y.f152914a;
            X8 x83 = new X8();
            x83.f152598c = new T8(J3.f152113s, str);
            this.f152565n = x83;
        } catch (JSONException unused3) {
            String str2 = "JSON exception while parsing file - " + this.f153189y.f152914a;
            X8 x84 = new X8();
            x84.f152598c = new T8(J3.f152113s, str2);
            this.f152565n = x84;
        }
    }
}
