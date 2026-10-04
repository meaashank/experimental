package com.mbridge.msdk.video.dynview.util.draw;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.video.dynview.c;
import com.mbridge.msdk.video.dynview.shape.a;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f160584d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f160585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f160586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f160587c;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.util.draw.a$a, reason: collision with other inner class name */
    public class RunnableC0644a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bitmap f160588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f160589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f160590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f160591d;

        /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.util.draw.a$a$a, reason: collision with other inner class name */
        public class RunnableC0645a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a.b f160593a;

            public RunnableC0645a(a.b bVar) {
                this.f160593a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f160585a == null || this.f160593a.build() == null) {
                    return;
                }
                a.this.f160585a.setBackground(this.f160593a.build());
            }
        }

        public RunnableC0644a(Bitmap bitmap, int i10, float f10, float f11) {
            this.f160588a = bitmap;
            this.f160589b = i10;
            this.f160590c = f10;
            this.f160591d = f11;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Bitmap bitmapA = a0.a(this.f160588a, 10);
                Bitmap bitmapA2 = a0.a(this.f160588a, 10);
                a.b bVarA = com.mbridge.msdk.video.dynview.shape.a.a();
                bVarA.orientation(this.f160589b).b(bitmapA).a(bitmapA2);
                if (this.f160589b == 2) {
                    float f10 = this.f160590c;
                    float f11 = this.f160591d;
                    if (f10 > f11) {
                        bVarA.b(f10).a(this.f160591d);
                    } else {
                        bVarA.b(f11).a(this.f160590c);
                    }
                } else {
                    bVarA.b(this.f160590c).a(this.f160591d);
                }
                if (a.this.f160585a != null) {
                    a.this.f160585a.post(new RunnableC0645a(bVarA));
                }
            } catch (Exception e10) {
                q0.b("ChoiceOneDrawBitBg", e10.getMessage());
            }
        }
    }

    private a() {
    }

    public void b() {
        if (this.f160585a != null) {
            this.f160585a = null;
        }
        Bitmap bitmap = this.f160586b;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f160586b.recycle();
            this.f160586b = null;
        }
        Bitmap bitmap2 = this.f160587c;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        this.f160587c.recycle();
        this.f160587c = null;
    }

    public static a a() {
        a aVar;
        if (f160584d != null) {
            return f160584d;
        }
        synchronized (a.class) {
            try {
                if (f160584d == null) {
                    f160584d = new a();
                }
                aVar = f160584d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public void a(Map<String, Bitmap> map, c cVar, View view) {
        if (view == null || cVar == null || map == null || map.size() == 0 || map.size() < 2 || cVar.b() == null || cVar.b().size() < 2) {
            return;
        }
        this.f160585a = view;
        int iH = cVar.h();
        float fM = cVar.m();
        float fK = cVar.k();
        try {
            List<CampaignEx> listB = cVar.b();
            String md5 = listB.get(0) != null ? SameMD5.getMD5(listB.get(0).getImageUrl()) : "";
            String md52 = listB.get(1) != null ? SameMD5.getMD5(listB.get(1).getImageUrl()) : "";
            Bitmap bitmap = null;
            Bitmap bitmap2 = (TextUtils.isEmpty(md5) || !map.containsKey(md5)) ? null : map.get(md5);
            if (!TextUtils.isEmpty(md52) && map.containsKey(md52)) {
                bitmap = map.get(md52);
            }
            Bitmap bitmap3 = bitmap;
            if (bitmap2 == null || bitmap2.isRecycled() || bitmap3 == null || bitmap3.isRecycled()) {
                return;
            }
            a(iH, fM, fK, bitmap2, bitmap3);
        } catch (Exception e10) {
            q0.b("ChoiceOneDrawBitBg", e10.getMessage());
        }
    }

    private synchronized void a(int i10, float f10, float f11, Bitmap bitmap, Bitmap bitmap2) throws Throwable {
        try {
            try {
                try {
                    com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new RunnableC0644a(bitmap, i10, f10, f11));
                } catch (Exception e10) {
                    e = e10;
                    q0.a("ChoiceOneDrawBitBg", e.getMessage());
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
