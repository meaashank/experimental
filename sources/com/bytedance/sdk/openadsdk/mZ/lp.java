package com.bytedance.sdk.openadsdk.mZ;

import B0.z;
import G7.a;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.core.view.E;
import com.bytedance.sdk.component.utils.om;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.utils.Cox;
import f3.d;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class lp extends Dialog {
    private String FA;
    private com.bytedance.sdk.openadsdk.core.TFq.uR Ht;
    private String Mm;
    private ZRu NOt;
    private com.bytedance.sdk.openadsdk.core.TFq.FA TFq;
    private String Vor;
    private com.bytedance.sdk.openadsdk.core.TFq.TFq ZRu;
    private final aT aT;
    private com.bytedance.sdk.openadsdk.core.TFq.NOt mZ;
    private com.bytedance.sdk.openadsdk.core.TFq.FA uR;

    public interface ZRu {
        void NOt();

        void ZRu();

        void ZRu(int i10, FilterWord filterWord, String str);

        void mZ();
    }

    public lp(@NonNull Context context, aT aTVar) {
        super(context, om.Ht(context, "tt_quick_option_dialog"));
        setCanceledOnTouchOutside(false);
        this.aT = aTVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        NOt();
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.core.TFq.TFq tFqZRu = ZRu(WMI.ZRu());
        this.ZRu = tFqZRu;
        setContentView(tFqZRu);
        ZRu(this.ZRu);
        mZ();
        ZRu();
        uR();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        ZRu zRu = this.NOt;
        if (zRu != null) {
            zRu.ZRu();
        }
    }

    private void ZRu(View view) {
        ZRu((EditText) this.mZ);
        aT aTVar = this.aT;
        if (aTVar != null) {
            String strMm = aTVar.Mm();
            if (!TextUtils.isEmpty(strMm)) {
                this.mZ.setText(strMm);
                this.uR.setText(String.format(Locale.getDefault(), "%d%s", Integer.valueOf(strMm.length()), "/200"));
            }
            this.TFq.setEnabled(!TextUtils.isEmpty(strMm));
        }
        this.TFq.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.mZ.lp.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                String string = lp.this.mZ.getText().toString();
                if (lp.this.NOt != null) {
                    lp.this.NOt.ZRu(4, aT.ZRu, string);
                }
                lp.this.dismiss();
            }
        });
        this.Ht.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.mZ.lp.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (lp.this.NOt != null) {
                    lp.this.NOt.NOt();
                }
                lp.this.dismiss();
            }
        });
        this.mZ.addTextChangedListener(new TextWatcher() { // from class: com.bytedance.sdk.openadsdk.mZ.lp.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                com.bytedance.sdk.openadsdk.core.TFq.FA fa2;
                int iRound = Math.round(charSequence.length());
                lp.this.uR.setText(z.a(iRound, "/200"));
                boolean z10 = true;
                if (iRound <= 0) {
                    fa2 = lp.this.TFq;
                    if (lp.this.aT == null || TextUtils.isEmpty(lp.this.aT.Mm())) {
                        z10 = false;
                    }
                } else if (lp.this.TFq.isEnabled()) {
                    return;
                } else {
                    fa2 = lp.this.TFq;
                }
                fa2.setEnabled(z10);
            }
        });
    }

    private void mZ() {
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        Window window = getWindow();
        if (window != null) {
            if (window.getDecorView() != null) {
                window.getDecorView().setPadding(0, 0, 0, 0);
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
            window.setGravity(80);
        }
    }

    private void uR() {
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.bytedance.sdk.openadsdk.mZ.lp.5
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                if (lp.this.NOt != null) {
                    lp.this.NOt.mZ();
                }
            }
        });
    }

    public void NOt() {
        InputMethodManager inputMethodManager;
        com.bytedance.sdk.openadsdk.core.TFq.NOt nOt = this.mZ;
        if (nOt == null || (inputMethodManager = (InputMethodManager) nOt.getContext().getSystemService(a.f45348f)) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.ZRu.getWindowToken(), 0);
    }

    public static void ZRu(EditText editText) {
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: com.bytedance.sdk.openadsdk.mZ.lp.4
            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
                while (i10 < i11) {
                    int type = Character.getType(charSequence.charAt(i10));
                    if (type == 19 || type == 28) {
                        return "";
                    }
                    i10++;
                }
                return null;
            }
        }, new InputFilter.LengthFilter(200)});
    }

    public void ZRu(ZRu zRu) {
        this.NOt = zRu;
    }

    public void ZRu() {
        com.bytedance.sdk.openadsdk.core.TFq.NOt nOt = this.mZ;
        if (nOt == null) {
            return;
        }
        nOt.requestFocus();
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    public void ZRu(String str, String str2) {
        this.Mm = str;
        this.FA = str2;
        aT aTVar = this.aT;
        if (aTVar != null) {
            aTVar.uR(str2);
        }
    }

    public void ZRu(String str) {
        this.Vor = str;
    }

    private com.bytedance.sdk.openadsdk.core.TFq.TFq ZRu(Context context) {
        com.bytedance.sdk.openadsdk.core.TFq.TFq tFq = new com.bytedance.sdk.openadsdk.core.TFq.TFq(context);
        tFq.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        tFq.setOrientation(1);
        tFq.setBackground(com.bytedance.sdk.openadsdk.utils.FA.ZRu(context, "tt_dislike_dialog_bg"));
        com.bytedance.sdk.openadsdk.core.TFq.Mm mm = new com.bytedance.sdk.openadsdk.core.TFq.Mm(context);
        mm.setLayoutParams(new LinearLayout.LayoutParams(-1, Cox.mZ(context, 48.0f)));
        this.Ht = new com.bytedance.sdk.openadsdk.core.TFq.uR(context);
        int iMZ = Cox.mZ(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iMZ, iMZ);
        layoutParams.addRule(16);
        layoutParams.addRule(11);
        int iMZ2 = Cox.mZ(context, 10.0f);
        layoutParams.topMargin = iMZ2;
        layoutParams.rightMargin = iMZ2;
        this.Ht.setLayoutParams(layoutParams);
        this.Ht.setClickable(true);
        this.Ht.setFocusable(true);
        this.Ht.setImageDrawable(com.bytedance.sdk.openadsdk.utils.FA.ZRu(context, "tt_titlebar_close_seletor"));
        com.bytedance.sdk.openadsdk.core.TFq.FA fa2 = new com.bytedance.sdk.openadsdk.core.TFq.FA(context);
        RelativeLayout.LayoutParams layoutParamsA = E3.a.a(-1, -2, 16);
        layoutParamsA.topMargin = Cox.mZ(context, 12.0f);
        fa2.setLayoutParams(layoutParamsA);
        fa2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        fa2.setGravity(17);
        fa2.setSingleLine(true);
        fa2.setText(om.ZRu(context, "tt_other_reason"));
        fa2.setTextColor(Color.parseColor("#161823"));
        fa2.setTextSize(15.0f);
        fa2.setTypeface(Typeface.defaultFromStyle(0));
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, Cox.mZ(context, 0.5f)));
        view.setBackgroundColor(Color.argb(51, 22, 24, 35));
        com.bytedance.sdk.openadsdk.core.TFq.TFq tFq2 = new com.bytedance.sdk.openadsdk.core.TFq.TFq(context);
        tFq2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        tFq2.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.TFq.NOt nOt = new com.bytedance.sdk.openadsdk.core.TFq.NOt(context);
        this.mZ = nOt;
        nOt.setFilters(new InputFilter[]{new InputFilter.LengthFilter(200), new InputFilter.AllCaps()});
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = Cox.mZ(context, 16.0f);
        layoutParams2.rightMargin = Cox.mZ(context, 16.0f);
        layoutParams2.topMargin = Cox.mZ(context, 11.5f);
        this.mZ.setLayoutParams(layoutParams2);
        this.mZ.setLines(4);
        this.mZ.setGravity(48);
        this.mZ.setHint(om.ZRu(context, "tt_suggestion_description"));
        this.mZ.setTextSize(15.0f);
        this.mZ.setTextColor(Color.rgb(22, 24, 35));
        this.mZ.setHintTextColor(Color.parseColor("#57161823"));
        this.mZ.setBackground(null);
        this.mZ.setImeOptions(268435456);
        com.bytedance.sdk.openadsdk.core.TFq.TFq tFq3 = new com.bytedance.sdk.openadsdk.core.TFq.TFq(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int iMZ3 = Cox.mZ(context, 16.0f);
        int iMZ4 = Cox.mZ(context, 17.0f);
        tFq3.setPadding(iMZ3, iMZ4, iMZ3, iMZ4);
        tFq3.setLayoutParams(layoutParams3);
        tFq3.setOrientation(0);
        this.uR = new com.bytedance.sdk.openadsdk.core.TFq.FA(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.gravity = E.f111493b;
        this.uR.setLayoutParams(layoutParams4);
        this.uR.setText(String.format("0%s", "/200"));
        this.uR.setGravity(E.f111493b);
        this.uR.setTextColor(Color.parseColor("#57161823"));
        this.uR.setTextSize(15.0f);
        this.TFq = new com.bytedance.sdk.openadsdk.core.TFq.FA(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 8388613;
        this.TFq.setLayoutParams(layoutParams5);
        this.TFq.setTextSize(14.0f);
        this.TFq.setTextColor(-1);
        this.TFq.setVisibility(0);
        this.TFq.setSingleLine(true);
        int iMZ5 = Cox.mZ(context, 27.0f);
        int iMZ6 = Cox.mZ(context, 5.0f);
        this.TFq.setPadding(iMZ5, iMZ6, iMZ5, iMZ6);
        int iMZ7 = Cox.mZ(context, 6.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f10 = iMZ7;
        gradientDrawable.setCornerRadius(f10);
        int iRgb = Color.rgb(d.f200563l, 44, 85);
        gradientDrawable.setColor(iRgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(f10);
        gradientDrawable2.setColor(iRgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        this.TFq.setBackground(stateListDrawable);
        this.TFq.setText(om.ZRu(context, "tt_done"));
        this.TFq.setEnabled(false);
        tFq.addView(mm);
        tFq.addView(view);
        tFq.addView(tFq2);
        mm.addView(this.Ht);
        mm.addView(fa2);
        tFq2.addView(this.mZ);
        tFq2.addView(tFq3);
        tFq3.addView(this.uR);
        tFq3.addView(this.TFq);
        return tFq;
    }
}
