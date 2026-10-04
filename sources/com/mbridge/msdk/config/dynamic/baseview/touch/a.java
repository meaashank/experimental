package com.mbridge.msdk.config.dynamic.baseview.touch;

import X3.i;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f155053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f155054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f155055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f155056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f155057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f155058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f155059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f155060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f155061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f155062j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f155063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f155064l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f155065m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f155066n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f155067o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<C0553a> f155068p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f155069q = 0;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.touch.a$a, reason: collision with other inner class name */
    public static class C0553a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f155070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f155071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f155072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f155073d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f155074e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f155075f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f155076g;

        public C0553a(int i10, float f10, float f11, float f12, float f13, float f14, int i11) {
            this.f155070a = i10;
            this.f155071b = f10;
            this.f155072c = f11;
            this.f155073d = f12;
            this.f155074e = f13;
            this.f155075f = f14;
            this.f155076g = i11;
        }
    }

    private float a(MotionEvent motionEvent) {
        return Build.VERSION.SDK_INT >= 29 ? motionEvent.getRawX(motionEvent.getActionIndex()) : motionEvent.getRawX();
    }

    private float b(MotionEvent motionEvent) {
        return Build.VERSION.SDK_INT >= 29 ? motionEvent.getRawY(motionEvent.getActionIndex()) : motionEvent.getRawY();
    }

    private void g(MotionEvent motionEvent) {
        this.f155068p.clear();
        if (Build.VERSION.SDK_INT < 29) {
            this.f155069q = 1;
            this.f155068p.add(new C0553a(motionEvent.getPointerId(0), motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getPressure(), motionEvent.getSize(), motionEvent.getOrientation(), motionEvent.getToolType(motionEvent.getActionIndex())));
        } else {
            this.f155069q = motionEvent.getPointerCount();
            for (int i10 = 0; i10 < this.f155069q; i10++) {
                this.f155068p.add(new C0553a(motionEvent.getPointerId(i10), motionEvent.getRawX(i10), motionEvent.getRawY(i10), motionEvent.getPressure(i10), motionEvent.getSize(i10), motionEvent.getOrientation(i10), motionEvent.getToolType(i10)));
            }
        }
    }

    private void h(MotionEvent motionEvent) {
        this.f155061i = motionEvent.getPressure();
        this.f155062j = motionEvent.getSize();
        this.f155063k = motionEvent.getOrientation();
        this.f155064l = motionEvent.getToolType(motionEvent.getActionIndex());
    }

    public void c(MotionEvent motionEvent) {
        g(motionEvent);
    }

    public void d(MotionEvent motionEvent) {
        this.f155053a = a(motionEvent);
        this.f155054b = b(motionEvent);
        this.f155059g = System.currentTimeMillis();
        h(motionEvent);
        g(motionEvent);
    }

    public void e(MotionEvent motionEvent) {
        this.f155055c = a(motionEvent);
        this.f155056d = b(motionEvent);
        h(motionEvent);
        g(motionEvent);
    }

    public void f(MotionEvent motionEvent) {
        this.f155057e = a(motionEvent);
        this.f155058f = b(motionEvent);
        this.f155060h = System.currentTimeMillis();
        h(motionEvent);
        g(motionEvent);
    }

    public void c(View view) {
        this.f155067o = view;
        this.f155065m = view.getWidth();
        this.f155066n = view.getHeight();
    }

    private void b(HashMap<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        for (C0553a c0553a : this.f155068p) {
            HashMap map2 = new HashMap();
            map2.put("x", String.valueOf(c0553a.f155071b));
            map2.put("y", String.valueOf(c0553a.f155072c));
            map2.put("pressure", String.valueOf(c0553a.f155073d));
            map2.put(i.f76775k, String.valueOf(c0553a.f155074e));
            map2.put("id", Integer.valueOf(c0553a.f155070a));
            arrayList.add(map2);
        }
        map.put("points", arrayList);
    }

    public HashMap<String, Object> a() {
        HashMap<String, Object> map = new HashMap<>();
        a(map);
        b(map);
        d(map);
        c(map);
        return map;
    }

    private void c(HashMap<String, Object> map) {
        map.put("down_x", Float.valueOf(this.f155053a));
        map.put("down_y", Float.valueOf(this.f155054b));
        map.put("down_time", Long.valueOf(this.f155059g));
        map.put("up_x", Float.valueOf(this.f155057e));
        map.put("up_y", Float.valueOf(this.f155058f));
        map.put("up_time", Long.valueOf(this.f155060h));
    }

    private void d(HashMap<String, Object> map) {
        View view = this.f155067o;
        if (view != null) {
            map.put("class_name", view.getClass().getSimpleName());
            String strB = b(this.f155067o);
            map.put("resource_id", strB);
            String strA = a(this.f155067o);
            map.put("content_desc", strA);
            map.put("view_format", String.format("%s#%s(%s)", this.f155067o.getClass().getSimpleName(), strB, strA));
        }
    }

    private void a(HashMap<String, Object> map) {
        map.put("event_name", "touch");
        map.put("event_time", String.valueOf(System.currentTimeMillis()));
        map.put("down_time", String.valueOf(this.f155059g));
    }

    public void c() {
        this.f155058f = 0.0f;
        this.f155057e = 0.0f;
        this.f155056d = 0.0f;
        this.f155055c = 0.0f;
        this.f155054b = 0.0f;
        this.f155053a = 0.0f;
        this.f155060h = 0L;
        this.f155059g = 0L;
        this.f155063k = 0.0f;
        this.f155062j = 0.0f;
        this.f155061i = 0.0f;
        this.f155064l = 0;
        this.f155066n = 0;
        this.f155065m = 0;
        this.f155067o = null;
        this.f155069q = 0;
        this.f155068p.clear();
    }

    private String a(View view) {
        CharSequence contentDescription = view.getContentDescription();
        return contentDescription != null ? contentDescription.toString() : "";
    }

    private String b(View view) {
        if (view.getId() != -1) {
            try {
                return view.getResources().getResourceEntryName(view.getId());
            } catch (Exception unused) {
                return String.valueOf(view.getId());
            }
        }
        return "";
    }

    public C0553a b() {
        if (this.f155068p.isEmpty()) {
            return null;
        }
        return this.f155068p.get(0);
    }
}
