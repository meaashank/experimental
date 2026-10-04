package yb;

import U6.b;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import t7.C5617a;

/* JADX INFO: loaded from: classes7.dex */
public class f {
    public static boolean a(Uri uri, ContentResolver contentResolver) {
        try {
            contentResolver.openFileDescriptor(uri, CampaignEx.JSON_KEY_AD_R).close();
            return true;
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
            return false;
        } catch (IOException e11) {
            e11.printStackTrace();
            return true;
        }
    }

    public static long b(Uri uri, ContentResolver contentResolver) {
        long j10;
        String scheme = uri.getScheme();
        if (!"content".equals(scheme)) {
            if (b.h.f68653a.equals(scheme)) {
                return new File(uri.getPath()).length();
            }
            return -1L;
        }
        Cursor cursorQuery = contentResolver.query(uri, null, null, null, null);
        if (cursorQuery != null) {
            try {
                j10 = cursorQuery.moveToFirst() ? cursorQuery.getLong(cursorQuery.getColumnIndex("_size")) : -1L;
            } finally {
                cursorQuery.close();
            }
        } else {
            j10 = -1;
        }
        return j10 == -1 ? c(uri, contentResolver) : j10;
    }

    public static long c(Uri uri, ContentResolver contentResolver) {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                byte[] bArr = new byte[8192];
                long j10 = 0;
                while (true) {
                    int i10 = inputStreamOpenInputStream.read(bArr);
                    if (i10 == -1) {
                        try {
                            inputStreamOpenInputStream.close();
                            return j10;
                        } catch (IOException e10) {
                            e10.printStackTrace();
                            return j10;
                        }
                    }
                    j10 += (long) i10;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                if (inputStreamOpenInputStream == null) {
                    return -1L;
                }
                try {
                    inputStreamOpenInputStream.close();
                    return -1L;
                } catch (IOException e12) {
                    e12.printStackTrace();
                    return -1L;
                }
            }
        } catch (Throwable th) {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static long d(Uri uri, ContentResolver contentResolver) {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                long j10 = 0;
                while (true) {
                    long jSkip = inputStreamOpenInputStream.skip(8192);
                    if (jSkip == -1) {
                        try {
                            inputStreamOpenInputStream.close();
                            return j10;
                        } catch (IOException e10) {
                            e10.printStackTrace();
                            return j10;
                        }
                    }
                    j10 += jSkip;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static boolean e() {
        ConnectivityManager connectivityManager;
        Context context = b.f241137a;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService(C5617a.f239212e)) == null) {
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static boolean f(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static byte[] g(String str) {
        byte[] bArr = null;
        try {
            File file = new File(str);
            bArr = new byte[(int) file.length()];
            new FileInputStream(file).read(bArr);
            return bArr;
        } catch (IOException e10) {
            e10.printStackTrace();
            return bArr;
        }
    }

    public static byte[] h(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byteArray = null;
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(obj);
            objectOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
            objectOutputStream.close();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException e10) {
            e10.printStackTrace();
            return byteArray;
        }
    }

    public static Object i(byte[] bArr) {
        Object object = null;
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            object = objectInputStream.readObject();
            objectInputStream.close();
            byteArrayInputStream.close();
            return object;
        } catch (IOException e10) {
            e10.printStackTrace();
            return object;
        } catch (ClassNotFoundException e11) {
            e11.printStackTrace();
            return object;
        }
    }

    public static void j(String str, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(str);
                } catch (IOException e10) {
                    e = e10;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (IOException e11) {
                e = e11;
                fileOutputStream2 = fileOutputStream;
                e.printStackTrace();
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e13) {
            e13.printStackTrace();
        }
    }
}
