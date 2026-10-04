package com.cookiegames.smartcookie.reading.activity;

import C4.q;
import android.R;
import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActivityC1486c;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.changelist.j;
import androidx.compose.runtime.internal.r;
import c4.C2902i;
import com.cookiegames.smartcookie.AppTheme;
import com.cookiegames.smartcookie.di.K;
import com.cookiegames.smartcookie.p;
import com.cookiegames.smartcookie.reading.activity.ReadingActivity;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import dd.g;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.text.C5013e;
import kotlin.text.F;
import kotlin.text.Regex;
import net.dankito.readability4j.Article;
import net.dankito.readability4j.Readability4J;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import w4.DialogInterfaceOnClickListenerC5751b;
import w4.DialogInterfaceOnClickListenerC5752c;
import w4.DialogInterfaceOnClickListenerC5755f;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nReadingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadingActivity.kt\ncom/cookiegames/smartcookie/reading/activity/ReadingActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,567:1\n1#2:568\n*E\n"})
@r(parameters = 0)
public final class ReadingActivity extends ActivityC1486c implements TextToSpeech.OnInitListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f147679m = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f147680n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final String f147681o = "ReadingUrl";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final String f147682p = "FileUrl";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f147683q = 30.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final float f147684r = 26.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final float f147685s = 22.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float f147686t = 18.0f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final float f147687u = 14.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final float f147688v = 10.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @g
    @Nullable
    public TextView f147689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @g
    @Nullable
    public TextView f147690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @g
    @Inject
    @Nullable
    public u4.e f147691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public TextToSpeech f147692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f147693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f147694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f147695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f147696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f147697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public ProgressDialog f147698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final io.reactivex.disposables.b f147699k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final String f147700l;

    public static final class a {
        public a() {
        }

        public final float b(int i10) {
            if (i10 == 0) {
                return 10.0f;
            }
            if (i10 == 1) {
                return 14.0f;
            }
            if (i10 == 2) {
                return 18.0f;
            }
            if (i10 == 3) {
                return 22.0f;
            }
            if (i10 != 4) {
                return i10 != 5 ? 18.0f : 30.0f;
            }
            return 26.0f;
        }

        public final void c(@NotNull Context context, @NotNull String url, boolean z10) {
            G.p(context, "context");
            G.p(url, "url");
            Intent intent = new Intent(context, (Class<?>) ReadingActivity.class);
            intent.putExtra(ReadingActivity.f147681o, url);
            intent.putExtra(ReadingActivity.f147682p, z10);
            context.startActivity(intent);
        }

        public a(C4969v c4969v) {
        }
    }

    @V({"SMAP\nReadingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadingActivity.kt\ncom/cookiegames/smartcookie/reading/activity/ReadingActivity$LoadData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,567:1\n1#2:568\n*E\n"})
    public final class b extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f147701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f147702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f147703c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public String f147704d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public String f147705e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public String f147706f;

        public b() {
        }

        @Nullable
        public Void a(@NotNull Void... params) throws Exception {
            G.p(params, "params");
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL(ReadingActivity.this.f147695g).openStream()));
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        String string = stringBuffer.toString();
                        G.o(string, "toString(...)");
                        String str = ReadingActivity.this.f147695g;
                        G.m(str);
                        Article article = new Readability4J(str, string).parse();
                        this.f147701a = article.getContent();
                        this.f147702b = article.getContentWithUtf8Encoding();
                        this.f147703c = article.getTextContent();
                        this.f147704d = article.getTitle();
                        this.f147705e = article.getByline();
                        this.f147706f = article.getExcerpt();
                        return null;
                    }
                    stringBuffer.append(line);
                }
            } catch (IOException e10) {
                e10.printStackTrace();
                return null;
            }
        }

        @Nullable
        public final String b() {
            return this.f147705e;
        }

        @Nullable
        public final String c() {
            return this.f147706f;
        }

        @Nullable
        public final String d() {
            return this.f147701a;
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Void doInBackground(Void[] voidArr) throws Exception {
            a(voidArr);
            return null;
        }

        @Nullable
        public final String e() {
            return this.f147702b;
        }

        @Nullable
        public final String f() {
            return this.f147703c;
        }

        @Nullable
        public final String g() {
            return this.f147704d;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(@Nullable Void r52) {
            String strP;
            String str = this.f147702b;
            if (str != null) {
                String strP2 = new Regex("image copyright").p(str, ReadingActivity.this.getResources().getString(p.s.Fe) + q.f17581a);
                strP = new Regex("￼").p(new Regex("image caption").p(strP2, ReadingActivity.this.getResources().getString(p.s.Ee) + q.f17581a), "");
            } else {
                strP = null;
            }
            try {
                Document document = Jsoup.parse(strP);
                Iterator<Element> it = document.select("img").iterator();
                G.o(it, "iterator(...)");
                while (it.hasNext()) {
                    it.next().remove();
                }
                ReadingActivity.this.A1(this.f147704d, document.outerHtml());
                ReadingActivity.this.n1();
            } catch (Exception unused) {
                TextView textView = ReadingActivity.this.f147689a;
                G.m(textView);
                textView.setAlpha(1.0f);
                TextView textView2 = ReadingActivity.this.f147689a;
                G.m(textView2);
                textView2.setVisibility(0);
                ReadingActivity readingActivity = ReadingActivity.this;
                TextView textView3 = readingActivity.f147689a;
                if (textView3 != null) {
                    textView3.setText(readingActivity.getResources().getString(p.s.Hh));
                }
                ReadingActivity.this.n1();
            }
        }

        public final void i(@Nullable String str) {
            this.f147705e = str;
        }

        public final void j(@Nullable String str) {
            this.f147706f = str;
        }

        public final void k(@Nullable String str) {
            this.f147701a = str;
        }

        public final void l(@Nullable String str) {
            this.f147702b = str;
        }

        public final void m(@Nullable String str) {
            this.f147703c = str;
        }

        public final void n(@Nullable String str) {
            this.f147704d = str;
        }
    }

    public static final class c extends ClickableSpan {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ URLSpan f147709b;

        public c(URLSpan uRLSpan) {
            this.f147709b = uRLSpan;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            G.p(widget, "widget");
            TextView textView = ReadingActivity.this.f147689a;
            G.m(textView);
            textView.setText(ReadingActivity.this.getString(p.s.fi));
            TextView textView2 = ReadingActivity.this.f147690b;
            G.m(textView2);
            textView2.setText(ReadingActivity.this.getString(p.s.f145661V7));
            ReadingActivity readingActivity = ReadingActivity.this;
            URLSpan uRLSpan = this.f147709b;
            readingActivity.f147695g = uRLSpan != null ? uRLSpan.getURL() : null;
            ReadingActivity.this.new b().execute(new Void[0]);
        }
    }

    public static final class d implements SeekBar.OnSeekBarChangeListener {
        public d() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar view, int i10, boolean z10) {
            G.p(view, "view");
            TextView textView = ReadingActivity.this.f147690b;
            G.m(textView);
            textView.setTextSize(ReadingActivity.f147679m.b(i10));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar arg0) {
            G.p(arg0, "arg0");
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar arg0) {
            G.p(arg0, "arg0");
        }
    }

    public static final class e implements okhttp3.e {
        public e() {
        }

        public static final void f(ReadingActivity readingActivity) {
            ProgressDialog progressDialog = readingActivity.f147698j;
            G.m(progressDialog);
            progressDialog.hide();
            Toast.makeText(readingActivity, readingActivity.getResources().getString(p.s.f145525M4), 1).show();
        }

        public static final void g(ReadingActivity readingActivity) {
            ProgressDialog progressDialog = readingActivity.f147698j;
            G.m(progressDialog);
            progressDialog.hide();
            Toast.makeText(readingActivity, readingActivity.getResources().getString(p.s.f145525M4), 1).show();
        }

        public static final void h(String str, ReadingActivity readingActivity) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                TextView textView = readingActivity.f147690b;
                G.m(textView);
                textView.setText(Html.fromHtml(jSONObject.getString("text")));
                ProgressDialog progressDialog = readingActivity.f147698j;
                G.m(progressDialog);
                progressDialog.hide();
            } catch (JSONException unused) {
            }
        }

        @Override // okhttp3.e
        public void a(okhttp3.d call, IOException e10) {
            G.p(call, "call");
            G.p(e10, "e");
            e10.printStackTrace();
            final ReadingActivity readingActivity = ReadingActivity.this;
            readingActivity.runOnUiThread(new Runnable() { // from class: w4.m
                @Override // java.lang.Runnable
                public final void run() {
                    ReadingActivity.e.f(readingActivity);
                }
            });
        }

        @Override // okhttp3.e
        @SuppressLint({"SetTextI18n"})
        public void b(okhttp3.d call, Response response) throws IOException {
            G.p(call, "call");
            G.p(response, "response");
            if (!response.G1()) {
                final ReadingActivity readingActivity = ReadingActivity.this;
                readingActivity.runOnUiThread(new Runnable() { // from class: w4.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ReadingActivity.e.g(readingActivity);
                    }
                });
                throw new IOException("Unexpected code " + response);
            }
            u uVar = response.f225298g;
            G.m(uVar);
            final String strN0 = uVar.N0();
            final ReadingActivity readingActivity2 = ReadingActivity.this;
            readingActivity2.runOnUiThread(new Runnable() { // from class: w4.l
                @Override // java.lang.Runnable
                public final void run() {
                    ReadingActivity.e.h(strN0, readingActivity2);
                }
            });
        }
    }

    public static final void l1(ReadingActivity readingActivity, ArrayList arrayList, DialogInterface dialogInterface, int i10) {
        readingActivity.j1((String) arrayList.get(i10));
    }

    public static final void m1(DialogInterface dialog, int i10) {
        G.p(dialog, "dialog");
        dialog.dismiss();
    }

    public static final void r1(final ReadingActivity readingActivity, String str) {
        readingActivity.runOnUiThread(new Runnable() { // from class: w4.j
            @Override // java.lang.Runnable
            public final void run() {
                ReadingActivity.s1(this.f240102a);
            }
        });
    }

    public static final void s1(ReadingActivity readingActivity) {
        readingActivity.f147694f = false;
        readingActivity.invalidateOptionsMenu();
    }

    public static final void t1(DialogInterface dialog, int i10) {
        G.p(dialog, "dialog");
        dialog.dismiss();
    }

    public static final void u1(ReadingActivity readingActivity, String[] strArr, DialogInterface dialogInterface, int i10) {
        readingActivity.C1(strArr[i10]);
    }

    public static final void v1(ReadingActivity readingActivity, SeekBar seekBar, DialogInterface dialogInterface, int i10) {
        readingActivity.f147697i = seekBar.getProgress();
        TextView textView = readingActivity.f147690b;
        G.m(textView);
        textView.setTextSize(f147679m.b(readingActivity.f147697i));
        u4.e eVar = readingActivity.f147691c;
        G.m(eVar);
        eVar.H2(seekBar.getProgress());
    }

    public static final void w1(DialogInterface dialog, int i10) {
        G.p(dialog, "dialog");
        dialog.dismiss();
    }

    public static final void x1(ReadingActivity readingActivity, DialogInterface dialog, int i10) {
        G.p(dialog, "dialog");
        dialog.dismiss();
        readingActivity.k1();
    }

    public static final void y1(ReadingActivity readingActivity, ArrayList arrayList, DialogInterface dialogInterface, int i10) {
        TextView textView = readingActivity.f147690b;
        G.m(textView);
        readingActivity.B1(textView, readingActivity.o1(readingActivity, (String) arrayList.get(i10)));
        TextView textView2 = readingActivity.f147689a;
        if (textView2 != null) {
            textView2.setText((CharSequence) arrayList.get(i10));
        }
        readingActivity.f147696h = true;
        readingActivity.f147695g = (String) arrayList.get(i10);
    }

    public final void A1(String str, String str2) {
        TextView textView = this.f147689a;
        if (textView == null || this.f147690b == null) {
            return;
        }
        G.m(textView);
        if (textView.getVisibility() == 4) {
            TextView textView2 = this.f147689a;
            G.m(textView2);
            textView2.setAlpha(1.0f);
            TextView textView3 = this.f147689a;
            G.m(textView3);
            textView3.setVisibility(0);
            TextView textView4 = this.f147689a;
            G.m(textView4);
            B1(textView4, str);
        } else {
            TextView textView5 = this.f147689a;
            G.m(textView5);
            textView5.setText(str);
            TextView textView6 = this.f147689a;
            G.m(textView6);
            B1(textView6, str);
        }
        TextView textView7 = this.f147690b;
        G.m(textView7);
        if (textView7.getVisibility() != 4) {
            TextView textView8 = this.f147690b;
            G.m(textView8);
            B1(textView8, str2);
            return;
        }
        TextView textView9 = this.f147690b;
        G.m(textView9);
        textView9.setAlpha(1.0f);
        TextView textView10 = this.f147690b;
        G.m(textView10);
        textView10.setVisibility(0);
        TextView textView11 = this.f147690b;
        G.m(textView11);
        B1(textView11, str2);
    }

    public final void B1(@NotNull TextView text, @Nullable String str) {
        G.p(text, "text");
        Spanned spannedFromHtml = Html.fromHtml(str);
        G.o(spannedFromHtml, "fromHtml(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        Object[] spans = spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        G.o(spans, "getSpans(...)");
        for (URLSpan uRLSpan : (URLSpan[]) spans) {
            q1(spannableStringBuilder, uRLSpan);
        }
        text.setText(spannableStringBuilder);
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C1(@Nullable String str) {
        OkHttpClient okHttpClient = new OkHttpClient();
        TextView textView = this.f147690b;
        G.m(textView);
        CharSequence text = textView.getText();
        G.n(text, "null cannot be cast to non-null type android.text.Spanned");
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f147698j = progressDialog;
        progressDialog.setProgressStyle(0);
        ProgressDialog progressDialog2 = this.f147698j;
        G.m(progressDialog2);
        progressDialog2.setCancelable(false);
        ProgressDialog progressDialog3 = this.f147698j;
        G.m(progressDialog3);
        progressDialog3.setIndeterminate(true);
        ProgressDialog progressDialog4 = this.f147698j;
        G.m(progressDialog4);
        progressDialog4.setMessage(getString(p.s.f145661V7));
        ProgressDialog progressDialog5 = this.f147698j;
        G.m(progressDialog5);
        progressDialog5.show();
        FormBody.Builder builder = new FormBody.Builder(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        String html = Html.toHtml((Spanned) text);
        G.o(html, "toHtml(...)");
        FormBody.Builder builderAdd = builder.add("text", F.B2(html, "\"", "\\\"", false, 4, null));
        if (str == null) {
            str = z4.e.f241233j;
        }
        FormBody formBodyBuild = builderAdd.add("lang", str).build();
        u4.e eVar = this.f147691c;
        String strY0 = eVar != null ? eVar.Y0() : null;
        Request.Builder builder2 = new Request.Builder();
        if (strY0 == null) {
            strY0 = "http://www.prism.com";
        }
        ((okhttp3.internal.connection.e) okHttpClient.a(builder2.url(strY0).addHeader("Accept", "application/json").method("POST", formBodyBuild).build())).H2(new e());
    }

    public final boolean j1(@Nullable String str) {
        return new File(getFilesDir(), j.a(str, com.prism.gaia.download.a.f164604o)).delete();
    }

    public final void k1() {
        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(this);
        materialAlertDialogBuilder.setTitle((CharSequence) (getResources().getString(p.s.f145490K) + com.prism.gaia.server.accounts.b.f166434b0));
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.select_dialog_singlechoice);
        String[] list = getFilesDir().list();
        G.o(list, "list(...)");
        final ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (F.d2(str, com.prism.gaia.download.a.f164604o, false, 2, null)) {
                arrayList.add(new Regex("....$").q(str, ""));
                arrayAdapter.add(new Regex("....$").q(str, ""));
            }
        }
        materialAlertDialogBuilder.setAdapter((ListAdapter) arrayAdapter, new DialogInterface.OnClickListener() { // from class: w4.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ReadingActivity.l1(this.f240092a, arrayList, dialogInterface, i10);
            }
        });
        materialAlertDialogBuilder.setPositiveButton((CharSequence) getResources().getString(p.s.f145460I), (DialogInterface.OnClickListener) new DialogInterfaceOnClickListenerC5751b());
        materialAlertDialogBuilder.show();
    }

    public final void n1() {
        ProgressDialog progressDialog = this.f147698j;
        if (progressDialog != null) {
            G.m(progressDialog);
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = this.f147698j;
                G.m(progressDialog2);
                progressDialog2.dismiss();
                this.f147698j = null;
            }
        }
    }

    @Nullable
    public final String o1(@NotNull Context context, @Nullable String str) {
        G.p(context, "context");
        try {
            FileInputStream fileInputStreamOpenFileInput = context.openFileInput(str + com.prism.gaia.download.a.f164604o);
            G.o(fileInputStreamOpenFileInput, "openFileInput(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStreamOpenFileInput, C5013e.f218326b), 8192);
            try {
                String strM = kotlin.io.u.m(bufferedReader);
                bufferedReader.close();
                return strM;
            } finally {
            }
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // androidx.fragment.app.r, androidx.activity.k, androidx.core.app.ActivityC2390m, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        K.b(this).y(this);
        overridePendingTransition(p.a.f141399a0, p.a.f141380I);
        u4.e eVar = this.f147691c;
        G.m(eVar);
        this.f147693e = eVar.M();
        this.f147692d = new TextToSpeech(this, this);
        if (this.f147693e) {
            u4.e eVar2 = this.f147691c;
            G.m(eVar2);
            if (eVar2.b1() == AppTheme.LIGHT) {
                setTheme(p.t.Be);
                getWindow().setBackgroundDrawable(new ColorDrawable(C4.r.i(this)));
            } else {
                setTheme(p.t.Ae);
                getWindow().setBackgroundDrawable(new ColorDrawable(C4.r.i(this)));
            }
        } else {
            u4.e eVar3 = this.f147691c;
            G.m(eVar3);
            if (eVar3.b1() == AppTheme.LIGHT) {
                setTheme(p.t.Ae);
            } else {
                u4.e eVar4 = this.f147691c;
                G.m(eVar4);
                if (eVar4.b1() == AppTheme.DARK) {
                    setTheme(p.t.Ce);
                } else {
                    setTheme(p.t.Be);
                }
            }
        }
        super.onCreate(bundle);
        setContentView(p.m.f145213d3);
        this.f147690b = (TextView) findViewById(p.j.f144400Kb);
        this.f147689a = (TextView) findViewById(p.j.f144414Lb);
        setSupportActionBar((Toolbar) findViewById(p.j.f144805mc));
        if (getSupportActionBar() != null) {
            ActionBar supportActionBar = getSupportActionBar();
            G.m(supportActionBar);
            supportActionBar.X(true);
        }
        u4.e eVar5 = this.f147691c;
        G.m(eVar5);
        this.f147697i = eVar5.A0();
        TextView textView = this.f147690b;
        G.m(textView);
        textView.setTextSize(f147679m.b(this.f147697i));
        TextView textView2 = this.f147689a;
        G.m(textView2);
        textView2.setText(getString(p.s.fi));
        TextView textView3 = this.f147690b;
        G.m(textView3);
        textView3.setText(getString(p.s.f145661V7));
        TextView textView4 = this.f147689a;
        G.m(textView4);
        textView4.setVisibility(4);
        TextView textView5 = this.f147690b;
        G.m(textView5);
        textView5.setVisibility(4);
        try {
            p1(getIntent());
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        G.p(menu, "menu");
        getMenuInflater().inflate(p.n.f145331j, menu);
        if (menu instanceof h) {
            ((h) menu).setOptionalIconsVisible(true);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // androidx.appcompat.app.ActivityC1486c, androidx.fragment.app.r, android.app.Activity
    public void onDestroy() {
        ProgressDialog progressDialog = this.f147698j;
        if (progressDialog != null) {
            G.m(progressDialog);
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = this.f147698j;
                G.m(progressDialog2);
                progressDialog2.dismiss();
                this.f147698j = null;
            }
        }
        TextToSpeech textToSpeech = this.f147692d;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        super.onDestroy();
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int i10) {
        if (i10 != 0) {
            Log.e("TTS", "Initilization Failed");
            return;
        }
        TextToSpeech textToSpeech = this.f147692d;
        G.m(textToSpeech);
        int language = textToSpeech.setLanguage(Locale.US);
        TextToSpeech textToSpeech2 = this.f147692d;
        G.m(textToSpeech2);
        textToSpeech2.setOnUtteranceCompletedListener(new TextToSpeech.OnUtteranceCompletedListener() { // from class: w4.i
            @Override // android.speech.tts.TextToSpeech.OnUtteranceCompletedListener
            public final void onUtteranceCompleted(String str) {
                ReadingActivity.r1(this.f240101a, str);
            }
        });
        if (language == -2 || language == -1) {
            Log.e("TTS", "Language is not supported");
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        G.p(item, "item");
        int itemId = item.getItemId();
        if (itemId == p.j.f144282C5) {
            u4.e eVar = this.f147691c;
            G.m(eVar);
            eVar.T1(!this.f147693e);
            String str = this.f147695g;
            if (str != null) {
                a aVar = f147679m;
                G.m(str);
                aVar.c(this, str, this.f147696h);
                finish();
            }
        } else if (itemId == p.j.f144999zc) {
            MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(this);
            materialAlertDialogBuilder.setTitle((CharSequence) getResources().getString(p.s.Vh));
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.select_dialog_singlechoice);
            arrayAdapter.addAll("English", "Français", "Português", "Português do Brasil", "Italiano");
            final String[] strArr = {z4.e.f241233j, "fr", "pt-pt", "pt-br", "it"};
            materialAlertDialogBuilder.setNegativeButton((CharSequence) "cancel", (DialogInterface.OnClickListener) new DialogInterfaceOnClickListenerC5752c());
            materialAlertDialogBuilder.setAdapter((ListAdapter) arrayAdapter, new DialogInterface.OnClickListener() { // from class: w4.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    ReadingActivity.u1(this.f240094a, strArr, dialogInterface, i10);
                }
            });
            materialAlertDialogBuilder.show();
        } else if (itemId == p.j.f144540Ub) {
            View viewInflate = LayoutInflater.from(this).inflate(p.m.f145275q0, (ViewGroup) null);
            final SeekBar seekBar = (SeekBar) viewInflate.findViewById(p.j.f144554Vb);
            seekBar.setOnSeekBarChangeListener(new d());
            seekBar.setMax(5);
            seekBar.setProgress(this.f147697i);
            MaterialAlertDialogBuilder positiveButton = new MaterialAlertDialogBuilder(this).setView(viewInflate).setTitle(p.s.ag).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: w4.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    ReadingActivity.v1(this.f240096a, seekBar, dialogInterface, i10);
                }
            });
            G.o(positiveButton, "setPositiveButton(...)");
            AlertDialog alertDialogShow = positiveButton.show();
            G.o(alertDialogShow, "show(...)");
            C2902i.i(this, alertDialogShow);
        } else if (itemId == p.j.f144811n3) {
            TextView textView = this.f147690b;
            G.m(textView);
            CharSequence text = textView.getText();
            G.n(text, "null cannot be cast to non-null type android.text.Spanned");
            String html = Html.toHtml((Spanned) text);
            TextView textView2 = this.f147689a;
            z1(this, html, String.valueOf(textView2 != null ? textView2.getText() : null));
        } else if (itemId == p.j.f144696f8) {
            MaterialAlertDialogBuilder materialAlertDialogBuilder2 = new MaterialAlertDialogBuilder(this);
            materialAlertDialogBuilder2.setTitle((CharSequence) (getResources().getString(p.s.f145784e0) + com.prism.gaia.server.accounts.b.f166434b0));
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, R.layout.select_dialog_singlechoice);
            String[] list = getFilesDir().list();
            G.o(list, "list(...)");
            final ArrayList arrayList = new ArrayList();
            for (String str2 : list) {
                if (F.d2(str2, com.prism.gaia.download.a.f164604o, false, 2, null)) {
                    arrayList.add(new Regex("....$").q(str2, ""));
                    arrayAdapter2.add(new Regex("....$").q(str2, ""));
                }
            }
            materialAlertDialogBuilder2.setPositiveButton((CharSequence) getResources().getString(p.s.f145460I), (DialogInterface.OnClickListener) new DialogInterfaceOnClickListenerC5755f());
            materialAlertDialogBuilder2.setNegativeButton((CharSequence) getResources().getString(p.s.f145490K), new DialogInterface.OnClickListener() { // from class: w4.g
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    ReadingActivity.x1(this.f240098a, dialogInterface, i10);
                }
            });
            materialAlertDialogBuilder2.setAdapter((ListAdapter) arrayAdapter2, new DialogInterface.OnClickListener() { // from class: w4.h
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    ReadingActivity.y1(this.f240099a, arrayList, dialogInterface, i10);
                }
            });
            materialAlertDialogBuilder2.show();
        } else if (itemId == p.j.f144289Cc) {
            if (this.f147694f) {
                TextToSpeech textToSpeech = this.f147692d;
                G.m(textToSpeech);
                textToSpeech.stop();
                this.f147694f = !this.f147694f;
            }
            TextView textView3 = this.f147690b;
            G.m(textView3);
            if (textView3.getSelectionEnd() < 1) {
                Toast.makeText(this, getResources().getString(p.s.zf), 1).show();
                return false;
            }
            TextView textView4 = this.f147690b;
            G.m(textView4);
            CharSequence text2 = textView4.getText();
            G.o(text2, "getText(...)");
            TextView textView5 = this.f147690b;
            G.m(textView5);
            int selectionStart = textView5.getSelectionStart();
            TextView textView6 = this.f147690b;
            G.m(textView6);
            String string = text2.subSequence(selectionStart, textView6.getSelectionEnd()).toString();
            if (G.g(string, "")) {
                Toast.makeText(this, getResources().getString(p.s.Af), 1).show();
                return false;
            }
            boolean z10 = this.f147694f;
            this.f147694f = !z10;
            if (!z10) {
                TextToSpeech textToSpeech2 = this.f147692d;
                G.m(textToSpeech2);
                textToSpeech2.speak(string, 0, null);
            }
            invalidateOptionsMenu();
        } else {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            overridePendingTransition(p.a.f141379H, p.a.f141401b0);
        }
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(@NotNull Menu menu) {
        G.p(menu, "menu");
        MenuItem menuItemFindItem = menu.findItem(p.j.f144289Cc);
        if (this.f147694f) {
            menuItemFindItem.setTitle(getResources().getString(p.s.Gg));
        } else {
            menuItemFindItem.setTitle(getResources().getString(p.s.Zh));
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public final boolean p1(Intent intent) throws IOException {
        if (intent != null) {
            this.f147695g = intent.getStringExtra(f147681o);
            boolean booleanExtra = intent.getBooleanExtra(f147682p, false);
            this.f147696h = booleanExtra;
            String str = this.f147695g;
            if (str != null) {
                if (booleanExtra) {
                    A1(str, o1(this, str));
                    return false;
                }
                if (getSupportActionBar() != null) {
                    ActionBar supportActionBar = getSupportActionBar();
                    G.m(supportActionBar);
                    supportActionBar.z0(C4.u.f17587a.m(this.f147695g));
                }
                ProgressDialog progressDialog = new ProgressDialog(this);
                this.f147698j = progressDialog;
                progressDialog.setProgressStyle(0);
                ProgressDialog progressDialog2 = this.f147698j;
                G.m(progressDialog2);
                progressDialog2.setCancelable(false);
                ProgressDialog progressDialog3 = this.f147698j;
                G.m(progressDialog3);
                progressDialog3.setIndeterminate(true);
                ProgressDialog progressDialog4 = this.f147698j;
                G.m(progressDialog4);
                progressDialog4.setMessage(getString(p.s.f145661V7));
                ProgressDialog progressDialog5 = this.f147698j;
                G.m(progressDialog5);
                progressDialog5.show();
                ProgressDialog progressDialog6 = this.f147698j;
                G.m(progressDialog6);
                C2902i.i(this, progressDialog6);
                new b().execute(new Void[0]);
                return true;
            }
        }
        return false;
    }

    public final void q1(@NotNull SpannableStringBuilder strBuilder, @Nullable URLSpan uRLSpan) {
        G.p(strBuilder, "strBuilder");
        strBuilder.setSpan(new c(uRLSpan), strBuilder.getSpanStart(uRLSpan), strBuilder.getSpanEnd(uRLSpan), strBuilder.getSpanFlags(uRLSpan));
        strBuilder.removeSpan(uRLSpan);
    }

    public final boolean z1(@NotNull Context context, @Nullable String str, @Nullable String str2) {
        G.p(context, "context");
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(str2 + com.prism.gaia.download.a.f164604o, 0);
            G.o(fileOutputStreamOpenFileOutput, "openFileOutput(...)");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStreamOpenFileOutput);
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return true;
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
