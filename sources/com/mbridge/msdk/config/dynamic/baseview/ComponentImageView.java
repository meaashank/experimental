package com.mbridge.msdk.config.dynamic.baseview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.mbridge.msdk.config.component.common.express.node.m;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.baseview.inter.a;
import com.mbridge.msdk.config.dynamic.utils.d;
import com.mbridge.msdk.config.dynamic.utils.f;
import com.mbridge.msdk.config.dynamic.utils.image.b;
import com.mbridge.msdk.foundation.tools.v0;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class ComponentImageView extends ImageView implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f154912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f154913b;
    public XMLView xmlView;

    public ComponentImageView(Context context, AttributeSet attributeSet) {
        super(context);
    }

    private void setEffectImage(Bitmap bitmap) {
        for (String str : this.f154912a.split("\\|")) {
            if (str.equals("blur")) {
                b.a(this, bitmap);
            } else if (str.contains("corner")) {
                b.a(this, bitmap, this.f154913b, str);
            } else if (str.equals("circle")) {
                b.b(this, bitmap);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            this.xmlView = d.a(this);
        } catch (Exception e10) {
            m.a(e10, new StringBuilder("onAttachedToWindow异常: "), "MBImageView");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setBitmap(Bitmap bitmap) {
        if (TextUtils.isEmpty(this.f154912a)) {
            setImageBitmap(bitmap);
        } else {
            setEffectImage(bitmap);
        }
    }

    public void setImages(Bitmap... bitmapArr) {
        b.a(this, bitmapArr);
    }

    public void setViewClickListener() {
        setOnClickListener(new View.OnClickListener() { // from class: M5.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f58809a.a(view);
            }
        });
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(map.get("data"));
            String strValueOf2 = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(strValueOf2) && strValueOf2.equals("true")) {
                setViewClickListener();
            }
            Object obj = map.get("effect");
            if (obj instanceof String) {
                this.f154912a = obj.toString();
            }
            Object obj2 = map.get("radius");
            if (obj2 instanceof String) {
                this.f154913b = Integer.parseInt(obj2.toString());
            }
            if (TextUtils.isEmpty(strValueOf)) {
                return;
            }
            if (strValueOf.startsWith("http")) {
                b.a(strValueOf, this);
                return;
            }
            BitmapDrawable bitmapDrawableN = v0.n(strValueOf);
            if (bitmapDrawableN != null) {
                setBackground(bitmapDrawableN);
            }
        } catch (Exception e10) {
            m.a(e10, new StringBuilder("setXmlData异常: "), "MBImageView");
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        try {
            if (obj instanceof String) {
                b.a((String) obj, this);
            }
        } catch (Exception e10) {
            m.a(e10, new StringBuilder("updateBindData异常: "), "MBImageView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        f.a(this.xmlView, view.getTag(), null);
    }
}
