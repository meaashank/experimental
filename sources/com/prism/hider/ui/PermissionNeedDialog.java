package com.prism.hider.ui;

import B0.C0920d;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;
import com.prism.commons.activity.WebViewActivity;
import java.io.Serializable;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
public class PermissionNeedDialog extends DialogFragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f168058d = "icon_id";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f168059e = "brand_id";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f168060f = "terms_sum_id";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f168061g = "call_back";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ITermsAgreeListener f168062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AlertDialog f168063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f168064c;

    public interface ITermsAgreeListener extends Serializable {
        void h1();

        void v3();
    }

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PermissionNeedDialog.this.f168062a != null) {
                PermissionNeedDialog.this.f168062a.h1();
            }
            dialogInterface.dismiss();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PermissionNeedDialog.this.e();
        }
    }

    public class d implements DialogInterface.OnKeyListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
            if (i10 != 4) {
                return false;
            }
            if (PermissionNeedDialog.this.f168062a == null) {
                return true;
            }
            PermissionNeedDialog.this.f168062a.h1();
            return true;
        }
    }

    public class e extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ URLSpan f168069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SpannableStringBuilder f168070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f168071c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f168072d;

        public e(URLSpan uRLSpan, SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            this.f168069a = uRLSpan;
            this.f168070b = spannableStringBuilder;
            this.f168071c = i10;
            this.f168072d = i11;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Intent intent = new Intent(PermissionNeedDialog.this.getActivity(), (Class<?>) WebViewActivity.class);
            intent.putExtra(WebViewActivity.f161967b, this.f168069a.getURL());
            intent.putExtra("EXTRA_KEY_TITLE", this.f168070b.subSequence(this.f168071c, this.f168072d).toString());
            PermissionNeedDialog.this.getActivity().startActivity(intent);
        }
    }

    public static PermissionNeedDialog d(@e.C int i10, @e.Z int i11, @e.Z int i12) {
        Bundle bundle = new Bundle();
        PermissionNeedDialog permissionNeedDialog = new PermissionNeedDialog();
        bundle.putInt(f168058d, i10);
        bundle.putInt(f168059e, i11);
        bundle.putInt(f168060f, i12);
        permissionNeedDialog.setArguments(bundle);
        return permissionNeedDialog;
    }

    public final CharSequence c(String str) {
        Spanned spannedFromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class)) {
            g(spannableStringBuilder, uRLSpan);
        }
        return spannableStringBuilder;
    }

    public final void e() {
        Log.d("permission_dialog", "request permission dialog");
        requestPermissions(this.f168064c, 1012);
    }

    public void f(ITermsAgreeListener iTermsAgreeListener) {
        this.f168062a = iTermsAgreeListener;
    }

    public final void g(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan) {
        int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
        int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
        int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
        e eVar = new e(uRLSpan, spannableStringBuilder, spanStart, spanEnd);
        UnderlineSpan underlineSpan = new UnderlineSpan() { // from class: com.prism.hider.ui.PermissionNeedDialog.6
            @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
            public void updateDrawState(@NonNull TextPaint textPaint) {
                textPaint.setColor(-1);
                textPaint.setUnderlineText(false);
            }
        };
        spannableStringBuilder.setSpan(eVar, spanStart, spanEnd, spanFlags);
        spannableStringBuilder.setSpan(underlineSpan, spanStart, spanEnd, spanFlags);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getDialog().getWindow().setLayout(-1, -1);
        getDialog().setOnKeyListener(new d());
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f168064c = (String[]) new LinkedList().toArray(new String[0]);
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.layout_hider_permission_need, viewGroup, false);
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 != 1012) {
            return;
        }
        Log.d("permission_dialog", "onRequestPermissionsResult");
        int length = iArr.length;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                z10 = true;
                break;
            } else if (iArr[i11] == -1) {
                break;
            } else {
                i11++;
            }
        }
        ITermsAgreeListener iTermsAgreeListener = this.f168062a;
        if (iTermsAgreeListener != null) {
            if (z10) {
                Log.d("permission_dialog", "agree all");
                this.f168062a.v3();
            } else {
                iTermsAgreeListener.h1();
                Log.d("permission_dialog", "disagree all");
            }
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        for (String str : this.f168064c) {
            if (C0920d.checkSelfPermission(getActivity(), str) == -1) {
                AlertDialog alertDialog = this.f168063b;
                if (alertDialog != null && alertDialog.isShowing()) {
                    this.f168063b.dismiss();
                }
                AlertDialog alertDialogCreate = new AlertDialog.Builder(getActivity()).setTitle(getResources().getString(R.string.permission_need_title, getResources().getString(getArguments().getInt(f168059e)))).setMessage(getString(getArguments().getInt(f168060f))).setPositiveButton(R.string.agree, new b()).setNegativeButton(R.string.disagree, new a()).setCancelable(false).create();
                this.f168063b = alertDialogCreate;
                alertDialogCreate.show();
                return;
            }
        }
        ITermsAgreeListener iTermsAgreeListener = this.f168062a;
        if (iTermsAgreeListener != null) {
            iTermsAgreeListener.v3();
        }
    }

    @Override // android.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.tv_title);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_subtitle);
        String string = getResources().getString(getArguments().getInt(f168059e));
        textView.setText(getResources().getString(R.string.permission_need_title, string));
        textView2.setText(getResources().getString(R.string.permission_need_subtitle, string));
        ((TextView) view.findViewById(R.id.tv_continue)).setOnClickListener(new c());
        ((ImageView) view.findViewById(R.id.iv_icon)).setImageDrawable(getResources().getDrawable(getArguments().getInt(f168058d)));
    }
}
