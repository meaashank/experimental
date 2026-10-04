package ca;

import android.content.Context;
import android.util.Log;
import com.prism.commons.utils.l0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f131297a = l0.b(e.class.getSimpleName());

    @Override // ca.b
    public boolean b(Context context) {
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(context.getResources().getIdentifier("hider_gallery", "raw", context.getPackageName()));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            for (int i10 = inputStreamOpenRawResource.read(); i10 != -1; i10 = inputStreamOpenRawResource.read()) {
                byteArrayOutputStream.write(i10);
            }
            inputStreamOpenRawResource.close();
            String string = byteArrayOutputStream.toString();
            try {
                new JSONObject(string);
                return false;
            } catch (JSONException e10) {
                Log.e(f131297a, "parse json failed str: " + string, e10);
                return false;
            }
        } catch (IOException e11) {
            Log.e(f131297a, "read raw / hider_gallery failed! ", e11);
            return false;
        }
    }

    public abstract String c();

    public abstract boolean d(JSONObject jSONObject);
}
