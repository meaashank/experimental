package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f160448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f160449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f160450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f160451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f160452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f160453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f160454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f160455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<CampaignEx> f160456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f160457j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f160458k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<String> f160459l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f160460m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f160461n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f160462o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f160463p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f160464q;

    public static class b implements InterfaceC0637c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f160465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f160466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f160467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f160468d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f160469e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f160470f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f160471g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private View f160472h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<CampaignEx> f160473i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f160474j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f160475k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private List<String> f160476l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f160477m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f160478n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f160479o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f160480p = 1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private String f160481q;

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0637c
        public c build() {
            return new c(this);
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0637c
        public InterfaceC0637c fileDirs(List<String> list) {
            this.f160476l = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0637c
        public InterfaceC0637c orientation(int i10) {
            this.f160470f = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0637c
        public InterfaceC0637c a(Context context) {
            this.f160465a = context.getApplicationContext();
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0637c
        public InterfaceC0637c b(int i10) {
            this.f160467c = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0637c
        public InterfaceC0637c c(String str) {
            this.f160466b = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0637c
        public InterfaceC0637c d(int i10) {
            this.f160477m = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0637c
        public InterfaceC0637c e(int i10) {
            this.f160480p = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0637c
        public InterfaceC0637c f(int i10) {
            this.f160479o = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0637c
        public InterfaceC0637c a(float f10) {
            this.f160469e = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0637c
        public InterfaceC0637c b(float f10) {
            this.f160468d = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0637c
        public InterfaceC0637c c(int i10) {
            this.f160471g = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0637c
        public InterfaceC0637c a(View view) {
            this.f160472h = view;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0637c
        public InterfaceC0637c b(String str) {
            this.f160481q = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0637c
        public InterfaceC0637c a(List<CampaignEx> list) {
            this.f160473i = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0637c
        public InterfaceC0637c a(int i10) {
            this.f160474j = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0637c
        public InterfaceC0637c a(boolean z10) {
            this.f160475k = z10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0637c
        public InterfaceC0637c a(String str) {
            this.f160478n = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.c$c, reason: collision with other inner class name */
    public interface InterfaceC0637c {
        InterfaceC0637c a(float f10);

        InterfaceC0637c a(int i10);

        InterfaceC0637c a(Context context);

        InterfaceC0637c a(View view);

        InterfaceC0637c a(String str);

        InterfaceC0637c a(List<CampaignEx> list);

        InterfaceC0637c a(boolean z10);

        InterfaceC0637c b(float f10);

        InterfaceC0637c b(int i10);

        InterfaceC0637c b(String str);

        c build();

        InterfaceC0637c c(int i10);

        InterfaceC0637c c(String str);

        InterfaceC0637c d(int i10);

        InterfaceC0637c e(int i10);

        InterfaceC0637c f(int i10);

        InterfaceC0637c fileDirs(List<String> list);

        InterfaceC0637c orientation(int i10);
    }

    public static b a() {
        return new b();
    }

    public List<CampaignEx> b() {
        return this.f160456i;
    }

    public Context c() {
        return this.f160448a;
    }

    public List<String> d() {
        return this.f160459l;
    }

    public int e() {
        return this.f160462o;
    }

    public String f() {
        return this.f160449b;
    }

    public int g() {
        return this.f160450c;
    }

    public int h() {
        return this.f160453f;
    }

    public View i() {
        return this.f160455h;
    }

    public int j() {
        return this.f160454g;
    }

    public float k() {
        return this.f160451d;
    }

    public int l() {
        return this.f160457j;
    }

    public float m() {
        return this.f160452e;
    }

    public String n() {
        return this.f160464q;
    }

    public int o() {
        return this.f160463p;
    }

    public boolean p() {
        return this.f160458k;
    }

    private c(b bVar) {
        this.f160452e = bVar.f160469e;
        this.f160451d = bVar.f160468d;
        this.f160453f = bVar.f160470f;
        this.f160454g = bVar.f160471g;
        this.f160448a = bVar.f160465a;
        this.f160449b = bVar.f160466b;
        this.f160450c = bVar.f160467c;
        this.f160455h = bVar.f160472h;
        this.f160456i = bVar.f160473i;
        this.f160457j = bVar.f160474j;
        this.f160458k = bVar.f160475k;
        this.f160459l = bVar.f160476l;
        this.f160460m = bVar.f160477m;
        this.f160461n = bVar.f160478n;
        this.f160462o = bVar.f160479o;
        this.f160463p = bVar.f160480p;
        this.f160464q = bVar.f160481q;
    }
}
