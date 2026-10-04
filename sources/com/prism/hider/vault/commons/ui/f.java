package com.prism.hider.vault.commons.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.prism.hider.vault.commons.C4269e;
import com.prism.hider.vault.commons.ui.e;

/* JADX INFO: loaded from: classes6.dex */
public class f extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Button f178637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Button f178638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f178639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f178640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f178641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f178642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f178643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f178644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CheckBox f178645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f178646j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f178647k;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (f.this.f178647k != null) {
                na.b.c().e(f.this.getContext(), f.this.f178645i.isChecked());
                f.this.f178647k.a();
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (f.this.f178646j != null) {
                f.this.f178646j.a();
            }
        }
    }

    public interface c {
        void a();
    }

    public interface d {
        void a();
    }

    public f(Context context) {
        super(context, e.n.f177421W4);
    }

    public final void d() {
        String str = this.f178641e;
        if (str != null) {
            this.f178639c.setText(str);
        }
        String str2 = this.f178642f;
        if (str2 != null) {
            this.f178640d.setText(str2);
        }
        String str3 = this.f178643g;
        if (str3 != null) {
            this.f178637a.setText(str3);
        }
        String str4 = this.f178644h;
        if (str4 != null) {
            this.f178638b.setText(str4);
        }
    }

    public final void e() {
        this.f178637a.setOnClickListener(new a());
        this.f178638b.setOnClickListener(new b());
    }

    public final void f() {
        this.f178637a = (Button) findViewById(e.h.f176665y7);
        this.f178638b = (Button) findViewById(e.h.f176563n4);
        this.f178639c = (TextView) findViewById(e.h.f176336M6);
        this.f178640d = (TextView) findViewById(e.h.f176661y3);
    }

    public void g(String str) {
        this.f178642f = str;
    }

    public void h(String str, c cVar) {
        if (str != null) {
            this.f178644h = str;
        }
        this.f178646j = cVar;
    }

    public void i(String str) {
        this.f178641e = str;
    }

    public void j(String str, d dVar) {
        if (str != null) {
            this.f178643g = str;
        }
        this.f178647k = dVar;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(e.k.f176816b0);
        this.f178645i = (CheckBox) findViewById(e.h.f176290H0);
        if (!C4269e.c(getContext())) {
            this.f178645i.setChecked(false);
            this.f178645i.setVisibility(8);
        }
        setCanceledOnTouchOutside(false);
        f();
        d();
        e();
    }
}
