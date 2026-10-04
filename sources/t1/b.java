package t1;

import U6.j;
import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.LruCacheKt;
import androidx.collection.N0;
import androidx.media.AudioAttributesCompat;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.google.common.base.Ascii;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.MBridgeConstans;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import okio.internal.ZipKt;
import org.objectweb.asm.Opcodes;
import p0.C5377a;
import s0.x;
import t1.c;
import w.y;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f238658A = "Compression";

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static final String f238659A0 = "OECF";

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public static final String f238660A1 = "GPSLongitudeRef";

    /* JADX INFO: renamed from: A2, reason: collision with root package name */
    public static final String f238661A2 = "CameraSettingsIFDPointer";

    /* JADX INFO: renamed from: A3, reason: collision with root package name */
    public static final short f238662A3 = 9;

    /* JADX INFO: renamed from: A4, reason: collision with root package name */
    public static final short f238663A4 = 2;

    /* JADX INFO: renamed from: A5, reason: collision with root package name */
    public static final int f238664A5 = 0;

    /* JADX INFO: renamed from: A6, reason: collision with root package name */
    public static final int f238665A6 = 9;

    /* JADX INFO: renamed from: A7, reason: collision with root package name */
    public static final byte f238666A7 = -49;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f238667B = "PhotometricInterpretation";

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public static final String f238668B0 = "SensitivityType";

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public static final String f238669B1 = "GPSLongitude";

    /* JADX INFO: renamed from: B2, reason: collision with root package name */
    public static final String f238670B2 = "ImageProcessingIFDPointer";

    /* JADX INFO: renamed from: B3, reason: collision with root package name */
    public static final short f238671B3 = 10;

    /* JADX INFO: renamed from: B4, reason: collision with root package name */
    public static final short f238672B4 = 3;

    /* JADX INFO: renamed from: B5, reason: collision with root package name */
    public static final int f238673B5 = 1;

    /* JADX INFO: renamed from: B6, reason: collision with root package name */
    public static final int f238674B6 = 10;

    /* JADX INFO: renamed from: B7, reason: collision with root package name */
    public static final byte f238675B7 = -38;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f238676C = "Orientation";

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public static final String f238677C0 = "StandardOutputSensitivity";

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public static final String f238678C1 = "GPSAltitudeRef";

    /* JADX INFO: renamed from: C2, reason: collision with root package name */
    public static final int f238679C2 = 512;

    /* JADX INFO: renamed from: C3, reason: collision with root package name */
    public static final short f238680C3 = 11;

    /* JADX INFO: renamed from: C4, reason: collision with root package name */
    public static final short f238681C4 = 4;

    /* JADX INFO: renamed from: C5, reason: collision with root package name */
    public static final int f238682C5 = 5000;

    /* JADX INFO: renamed from: C6, reason: collision with root package name */
    public static final int f238683C6 = 11;

    /* JADX INFO: renamed from: C7, reason: collision with root package name */
    public static final byte f238684C7 = -31;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f238685D = "SamplesPerPixel";

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public static final String f238686D0 = "RecommendedExposureIndex";

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public static final String f238687D1 = "GPSAltitude";

    /* JADX INFO: renamed from: D2, reason: collision with root package name */
    public static final int f238688D2 = 0;

    /* JADX INFO: renamed from: D3, reason: collision with root package name */
    public static final short f238689D3 = 12;

    /* JADX INFO: renamed from: D4, reason: collision with root package name */
    public static final short f238690D4 = 0;

    /* JADX INFO: renamed from: D6, reason: collision with root package name */
    public static final int f238692D6 = 12;

    /* JADX INFO: renamed from: D7, reason: collision with root package name */
    public static final byte f238693D7 = -2;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f238694E = "PlanarConfiguration";

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public static final String f238695E0 = "ISOSpeed";

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public static final String f238696E1 = "GPSTimeStamp";

    /* JADX INFO: renamed from: E2, reason: collision with root package name */
    public static final int f238697E2 = 1;

    /* JADX INFO: renamed from: E3, reason: collision with root package name */
    public static final short f238698E3 = 13;

    /* JADX INFO: renamed from: E4, reason: collision with root package name */
    public static final short f238699E4 = 1;

    /* JADX INFO: renamed from: E5, reason: collision with root package name */
    public static final String f238700E5 = "FUJIFILMCCD-RAW";

    /* JADX INFO: renamed from: E6, reason: collision with root package name */
    public static final int f238701E6 = 13;

    /* JADX INFO: renamed from: E7, reason: collision with root package name */
    public static final byte f238702E7 = -39;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f238703F = "YCbCrSubSampling";

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public static final String f238704F0 = "ISOSpeedLatitudeyyy";

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public static final String f238705F1 = "GPSSatellites";

    /* JADX INFO: renamed from: F2, reason: collision with root package name */
    public static final int f238706F2 = 2;

    /* JADX INFO: renamed from: F3, reason: collision with root package name */
    public static final short f238707F3 = 14;

    /* JADX INFO: renamed from: F4, reason: collision with root package name */
    public static final short f238708F4 = 2;

    /* JADX INFO: renamed from: F5, reason: collision with root package name */
    public static final int f238709F5 = 84;

    /* JADX INFO: renamed from: F6, reason: collision with root package name */
    public static final int f238710F6 = 8192;

    /* JADX INFO: renamed from: F7, reason: collision with root package name */
    public static final int f238711F7 = 0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String f238712G = "YCbCrPositioning";

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public static final String f238713G0 = "ISOSpeedLatitudezzz";

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public static final String f238714G1 = "GPSStatus";

    /* JADX INFO: renamed from: G2, reason: collision with root package name */
    public static final int f238715G2 = 3;

    /* JADX INFO: renamed from: G3, reason: collision with root package name */
    public static final short f238716G3 = 15;

    /* JADX INFO: renamed from: G4, reason: collision with root package name */
    public static final short f238717G4 = 0;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    public static final int f238720G7 = 1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final String f238721H = "XResolution";

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public static final String f238722H0 = "ShutterSpeedValue";

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public static final String f238723H1 = "GPSMeasureMode";

    /* JADX INFO: renamed from: H2, reason: collision with root package name */
    public static final int f238724H2 = 4;

    /* JADX INFO: renamed from: H3, reason: collision with root package name */
    public static final short f238725H3 = 16;

    /* JADX INFO: renamed from: H4, reason: collision with root package name */
    public static final short f238726H4 = 0;

    /* JADX INFO: renamed from: H7, reason: collision with root package name */
    public static final int f238729H7 = 2;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final String f238730I = "YResolution";

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public static final String f238731I0 = "ApertureValue";

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public static final String f238732I1 = "GPSDOP";

    /* JADX INFO: renamed from: I2, reason: collision with root package name */
    public static final int f238733I2 = 5;

    /* JADX INFO: renamed from: I3, reason: collision with root package name */
    public static final short f238734I3 = 17;

    /* JADX INFO: renamed from: I4, reason: collision with root package name */
    public static final short f238735I4 = 0;

    /* JADX INFO: renamed from: I7, reason: collision with root package name */
    public static final int f238738I7 = 3;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final String f238739J = "ResolutionUnit";

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public static final String f238740J0 = "BrightnessValue";

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public static final String f238741J1 = "GPSSpeedRef";

    /* JADX INFO: renamed from: J2, reason: collision with root package name */
    public static final int f238742J2 = 6;

    /* JADX INFO: renamed from: J3, reason: collision with root package name */
    public static final short f238743J3 = 18;

    /* JADX INFO: renamed from: J4, reason: collision with root package name */
    public static final short f238744J4 = 0;

    /* JADX INFO: renamed from: J5, reason: collision with root package name */
    public static final short f238745J5 = 20306;

    /* JADX INFO: renamed from: J6, reason: collision with root package name */
    public static final f[] f238746J6;

    /* JADX INFO: renamed from: J7, reason: collision with root package name */
    public static final int f238747J7 = 4;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final String f238748K = "StripOffsets";

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public static final String f238749K0 = "ExposureBiasValue";

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    public static final String f238750K1 = "GPSSpeed";

    /* JADX INFO: renamed from: K2, reason: collision with root package name */
    public static final int f238751K2 = 7;

    /* JADX INFO: renamed from: K3, reason: collision with root package name */
    public static final short f238752K3 = 19;

    /* JADX INFO: renamed from: K4, reason: collision with root package name */
    public static final short f238753K4 = 1;

    /* JADX INFO: renamed from: K5, reason: collision with root package name */
    public static final short f238754K5 = 21330;

    /* JADX INFO: renamed from: K6, reason: collision with root package name */
    public static final f[] f238755K6;

    /* JADX INFO: renamed from: K7, reason: collision with root package name */
    public static final int f238756K7 = 5;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final String f238757L = "RowsPerStrip";

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public static final String f238758L0 = "MaxApertureValue";

    /* JADX INFO: renamed from: L1, reason: collision with root package name */
    public static final String f238759L1 = "GPSTrackRef";

    /* JADX INFO: renamed from: L2, reason: collision with root package name */
    public static final int f238760L2 = 8;

    /* JADX INFO: renamed from: L3, reason: collision with root package name */
    public static final short f238761L3 = 20;

    /* JADX INFO: renamed from: L4, reason: collision with root package name */
    public static final short f238762L4 = 2;

    /* JADX INFO: renamed from: L6, reason: collision with root package name */
    public static final f[] f238764L6;

    /* JADX INFO: renamed from: L7, reason: collision with root package name */
    public static final int f238765L7 = 6;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final String f238766M = "StripByteCounts";

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public static final String f238767M0 = "SubjectDistance";

    /* JADX INFO: renamed from: M1, reason: collision with root package name */
    public static final String f238768M1 = "GPSTrack";

    /* JADX INFO: renamed from: M3, reason: collision with root package name */
    public static final short f238770M3 = 21;

    /* JADX INFO: renamed from: M4, reason: collision with root package name */
    public static final short f238771M4 = 0;

    /* JADX INFO: renamed from: M6, reason: collision with root package name */
    public static final f[] f238773M6;

    /* JADX INFO: renamed from: M7, reason: collision with root package name */
    public static final int f238774M7 = 7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final String f238775N = "JPEGInterchangeFormat";

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public static final String f238776N0 = "MeteringMode";

    /* JADX INFO: renamed from: N1, reason: collision with root package name */
    public static final String f238777N1 = "GPSImgDirectionRef";

    /* JADX INFO: renamed from: N3, reason: collision with root package name */
    public static final short f238779N3 = 22;

    /* JADX INFO: renamed from: N4, reason: collision with root package name */
    public static final short f238780N4 = 1;

    /* JADX INFO: renamed from: N5, reason: collision with root package name */
    public static final int f238781N5 = 8;

    /* JADX INFO: renamed from: N6, reason: collision with root package name */
    public static final f[] f238782N6;

    /* JADX INFO: renamed from: N7, reason: collision with root package name */
    public static final int f238783N7 = 8;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final String f238784O = "JPEGInterchangeFormatLength";

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public static final String f238785O0 = "LightSource";

    /* JADX INFO: renamed from: O1, reason: collision with root package name */
    public static final String f238786O1 = "GPSImgDirection";

    /* JADX INFO: renamed from: O2, reason: collision with root package name */
    public static final short f238787O2 = 1;

    /* JADX INFO: renamed from: O3, reason: collision with root package name */
    public static final short f238788O3 = 23;

    /* JADX INFO: renamed from: O4, reason: collision with root package name */
    public static final short f238789O4 = 2;

    /* JADX INFO: renamed from: O5, reason: collision with root package name */
    public static final int f238790O5 = 12;

    /* JADX INFO: renamed from: O6, reason: collision with root package name */
    public static final f f238791O6;

    /* JADX INFO: renamed from: O7, reason: collision with root package name */
    public static final int f238792O7 = 9;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final String f238793P = "TransferFunction";

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public static final String f238794P0 = "Flash";

    /* JADX INFO: renamed from: P1, reason: collision with root package name */
    public static final String f238795P1 = "GPSMapDatum";

    /* JADX INFO: renamed from: P2, reason: collision with root package name */
    public static final short f238796P2 = 2;

    /* JADX INFO: renamed from: P3, reason: collision with root package name */
    public static final short f238797P3 = 24;

    /* JADX INFO: renamed from: P4, reason: collision with root package name */
    public static final short f238798P4 = 3;

    /* JADX INFO: renamed from: P5, reason: collision with root package name */
    public static final short f238799P5 = 85;

    /* JADX INFO: renamed from: P6, reason: collision with root package name */
    public static final f[] f238800P6;

    /* JADX INFO: renamed from: P7, reason: collision with root package name */
    public static final int f238801P7 = 10;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final String f238802Q = "WhitePoint";

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public static final String f238803Q0 = "SubjectArea";

    /* JADX INFO: renamed from: Q1, reason: collision with root package name */
    public static final String f238804Q1 = "GPSDestLatitudeRef";

    /* JADX INFO: renamed from: Q2, reason: collision with root package name */
    public static final short f238805Q2 = 1;

    /* JADX INFO: renamed from: Q3, reason: collision with root package name */
    public static final short f238806Q3 = 255;

    /* JADX INFO: renamed from: Q4, reason: collision with root package name */
    public static final String f238807Q4 = "N";

    /* JADX INFO: renamed from: Q5, reason: collision with root package name */
    public static final String f238808Q5 = "PENTAX";

    /* JADX INFO: renamed from: Q6, reason: collision with root package name */
    public static final f[] f238809Q6;

    /* JADX INFO: renamed from: Q7, reason: collision with root package name */
    public static final int f238810Q7 = 11;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final String f238811R = "PrimaryChromaticities";

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public static final String f238812R0 = "FocalLength";

    /* JADX INFO: renamed from: R1, reason: collision with root package name */
    public static final String f238813R1 = "GPSDestLatitude";

    /* JADX INFO: renamed from: R2, reason: collision with root package name */
    public static final short f238814R2 = 2;

    /* JADX INFO: renamed from: R3, reason: collision with root package name */
    public static final short f238815R3 = 1;

    /* JADX INFO: renamed from: R4, reason: collision with root package name */
    public static final String f238816R4 = "S";

    /* JADX INFO: renamed from: R5, reason: collision with root package name */
    public static final int f238817R5 = 6;

    /* JADX INFO: renamed from: R6, reason: collision with root package name */
    public static final f[] f238818R6;

    /* JADX INFO: renamed from: R7, reason: collision with root package name */
    public static final int f238819R7 = 12;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final String f238820S = "YCbCrCoefficients";

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public static final String f238821S0 = "FlashEnergy";

    /* JADX INFO: renamed from: S1, reason: collision with root package name */
    public static final String f238822S1 = "GPSDestLongitudeRef";

    /* JADX INFO: renamed from: S2, reason: collision with root package name */
    public static final short f238823S2 = 2;

    /* JADX INFO: renamed from: S3, reason: collision with root package name */
    public static final short f238824S3 = 4;

    /* JADX INFO: renamed from: S4, reason: collision with root package name */
    public static final String f238825S4 = "E";

    /* JADX INFO: renamed from: S6, reason: collision with root package name */
    public static final f[] f238827S6;

    /* JADX INFO: renamed from: S7, reason: collision with root package name */
    public static final int f238828S7 = 13;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final String f238829T = "ReferenceBlackWhite";

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public static final String f238830T0 = "SpatialFrequencyResponse";

    /* JADX INFO: renamed from: T1, reason: collision with root package name */
    public static final String f238831T1 = "GPSDestLongitude";

    /* JADX INFO: renamed from: T2, reason: collision with root package name */
    public static final short f238832T2 = 3;

    /* JADX INFO: renamed from: T3, reason: collision with root package name */
    public static final short f238833T3 = 6;

    /* JADX INFO: renamed from: T4, reason: collision with root package name */
    public static final String f238834T4 = "W";

    /* JADX INFO: renamed from: T6, reason: collision with root package name */
    public static final int f238836T6 = 0;

    /* JADX INFO: renamed from: T7, reason: collision with root package name */
    public static final int f238837T7 = 14;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final String f238838U = "DateTime";

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public static final String f238839U0 = "FocalPlaneXResolution";

    /* JADX INFO: renamed from: U1, reason: collision with root package name */
    public static final String f238840U1 = "GPSDestBearingRef";

    /* JADX INFO: renamed from: U2, reason: collision with root package name */
    public static final int f238841U2 = 1;

    /* JADX INFO: renamed from: U3, reason: collision with root package name */
    public static final short f238842U3 = 8;

    /* JADX INFO: renamed from: U4, reason: collision with root package name */
    public static final short f238843U4 = 0;

    /* JADX INFO: renamed from: U6, reason: collision with root package name */
    public static final int f238845U6 = 1;

    /* JADX INFO: renamed from: U7, reason: collision with root package name */
    public static final Pattern f238846U7;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final String f238847V = "ImageDescription";

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public static final String f238848V0 = "FocalPlaneYResolution";

    /* JADX INFO: renamed from: V1, reason: collision with root package name */
    public static final String f238849V1 = "GPSDestBearing";

    /* JADX INFO: renamed from: V2, reason: collision with root package name */
    public static final int f238850V2 = 65535;

    /* JADX INFO: renamed from: V3, reason: collision with root package name */
    public static final short f238851V3 = 16;

    /* JADX INFO: renamed from: V4, reason: collision with root package name */
    public static final short f238852V4 = 1;

    /* JADX INFO: renamed from: V6, reason: collision with root package name */
    public static final int f238854V6 = 2;

    /* JADX INFO: renamed from: V7, reason: collision with root package name */
    public static final Pattern f238855V7;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final String f238856W = "Make";

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public static final String f238857W0 = "FocalPlaneResolutionUnit";

    /* JADX INFO: renamed from: W1, reason: collision with root package name */
    public static final String f238858W1 = "GPSDestDistanceRef";

    /* JADX INFO: renamed from: W2, reason: collision with root package name */
    public static final short f238859W2 = 0;

    /* JADX INFO: renamed from: W3, reason: collision with root package name */
    public static final short f238860W3 = 24;

    /* JADX INFO: renamed from: W4, reason: collision with root package name */
    public static final String f238861W4 = "A";

    /* JADX INFO: renamed from: W5, reason: collision with root package name */
    public static final int f238862W5 = 4;

    /* JADX INFO: renamed from: W6, reason: collision with root package name */
    public static final int f238863W6 = 3;

    /* JADX INFO: renamed from: W7, reason: collision with root package name */
    public static final Pattern f238864W7;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final String f238865X = "Model";

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public static final String f238866X0 = "SubjectLocation";

    /* JADX INFO: renamed from: X1, reason: collision with root package name */
    public static final String f238867X1 = "GPSDestDistance";

    /* JADX INFO: renamed from: X2, reason: collision with root package name */
    public static final short f238868X2 = 1;

    /* JADX INFO: renamed from: X3, reason: collision with root package name */
    public static final short f238869X3 = 32;

    /* JADX INFO: renamed from: X4, reason: collision with root package name */
    public static final String f238870X4 = "V";

    /* JADX INFO: renamed from: X5, reason: collision with root package name */
    public static final int f238871X5 = 4;

    /* JADX INFO: renamed from: X6, reason: collision with root package name */
    public static final int f238872X6 = 4;

    /* JADX INFO: renamed from: X7, reason: collision with root package name */
    public static final Pattern f238873X7;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final String f238874Y = "Software";

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public static final String f238875Y0 = "ExposureIndex";

    /* JADX INFO: renamed from: Y1, reason: collision with root package name */
    public static final String f238876Y1 = "GPSProcessingMethod";

    /* JADX INFO: renamed from: Y2, reason: collision with root package name */
    public static final short f238877Y2 = 2;

    /* JADX INFO: renamed from: Y3, reason: collision with root package name */
    public static final short f238878Y3 = 64;

    /* JADX INFO: renamed from: Y4, reason: collision with root package name */
    public static final String f238879Y4 = "2";

    /* JADX INFO: renamed from: Y6, reason: collision with root package name */
    public static final int f238881Y6 = 5;

    /* JADX INFO: renamed from: Y7, reason: collision with root package name */
    public static final int f238882Y7 = 19;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final String f238883Z = "Artist";

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public static final String f238884Z0 = "SensingMethod";

    /* JADX INFO: renamed from: Z1, reason: collision with root package name */
    public static final String f238885Z1 = "GPSAreaInformation";

    /* JADX INFO: renamed from: Z2, reason: collision with root package name */
    public static final short f238886Z2 = 3;

    /* JADX INFO: renamed from: Z3, reason: collision with root package name */
    public static final short f238887Z3 = 1;

    /* JADX INFO: renamed from: Z4, reason: collision with root package name */
    public static final String f238888Z4 = "3";

    /* JADX INFO: renamed from: Z6, reason: collision with root package name */
    public static final int f238890Z6 = 6;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f238891a0 = "Copyright";

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final String f238892a1 = "FileSource";

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public static final String f238893a2 = "GPSDateStamp";

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public static final short f238894a3 = 4;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static final short f238895a4 = 2;

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    public static final String f238896a5 = "K";

    /* JADX INFO: renamed from: a6, reason: collision with root package name */
    public static final int f238897a6 = 4;

    /* JADX INFO: renamed from: a7, reason: collision with root package name */
    public static final int f238898a7 = 7;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f238899b0 = "ExifVersion";

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final String f238900b1 = "SceneType";

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public static final String f238901b2 = "GPSDifferential";

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    public static final short f238902b3 = 5;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public static final short f238903b4 = 3;

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    public static final String f238904b5 = "M";

    /* JADX INFO: renamed from: b7, reason: collision with root package name */
    public static final int f238906b7 = 8;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f238907c0 = "FlashpixVersion";

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final String f238908c1 = "CFAPattern";

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public static final String f238909c2 = "GPSHPositioningError";

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    public static final short f238910c3 = 6;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public static final short f238911c4 = 4;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final String f238912c5 = "N";

    /* JADX INFO: renamed from: c7, reason: collision with root package name */
    public static final int f238914c7 = 9;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f238915d0 = "ColorSpace";

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final String f238916d1 = "CustomRendered";

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public static final String f238917d2 = "InteroperabilityIndex";

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final short f238918d3 = 7;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public static final short f238919d4 = 5;

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    public static final String f238920d5 = "T";

    /* JADX INFO: renamed from: d6, reason: collision with root package name */
    public static final byte f238921d6 = 47;

    /* JADX INFO: renamed from: d7, reason: collision with root package name */
    public static final f[][] f238922d7;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f238923e0 = "Gamma";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final String f238924e1 = "ExposureMode";

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public static final String f238925e2 = "ThumbnailImageLength";

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    public static final short f238926e3 = 8;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    public static final short f238927e4 = 7;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    public static final String f238928e5 = "M";

    /* JADX INFO: renamed from: e7, reason: collision with root package name */
    public static final f[] f238930e7;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f238931f0 = "PixelXDimension";

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final String f238932f1 = "WhiteBalance";

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public static final String f238933f2 = "ThumbnailImageWidth";

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    public static final short f238934f3 = 0;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public static final short f238935f4 = 8;

    /* JADX INFO: renamed from: f5, reason: collision with root package name */
    public static final String f238936f5 = "K";

    /* JADX INFO: renamed from: f7, reason: collision with root package name */
    public static final HashMap<Integer, f>[] f238938f7;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f238939g0 = "PixelYDimension";

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final String f238940g1 = "DigitalZoomRatio";

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f238941g2 = "ThumbnailOrientation";

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final short f238942g3 = 1;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public static final short f238943g4 = 0;

    /* JADX INFO: renamed from: g5, reason: collision with root package name */
    public static final String f238944g5 = "M";

    /* JADX INFO: renamed from: g7, reason: collision with root package name */
    public static final HashMap<String, f>[] f238946g7;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f238947h0 = "ComponentsConfiguration";

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final String f238948h1 = "FocalLengthIn35mmFilm";

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public static final String f238949h2 = "DNGVersion";

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final short f238950h3 = 2;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public static final short f238951h4 = 1;

    /* JADX INFO: renamed from: h5, reason: collision with root package name */
    public static final String f238952h5 = "N";

    /* JADX INFO: renamed from: h7, reason: collision with root package name */
    public static final HashSet<String> f238954h7;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f238955i0 = "CompressedBitsPerPixel";

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final String f238956i1 = "SceneCaptureType";

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public static final String f238957i2 = "DefaultCropSize";

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final short f238958i3 = 3;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final short f238959i4 = 2;

    /* JADX INFO: renamed from: i5, reason: collision with root package name */
    public static final short f238960i5 = 0;

    /* JADX INFO: renamed from: i7, reason: collision with root package name */
    public static final HashMap<Integer, Integer> f238962i7;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f238963j0 = "MakerNote";

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final String f238964j1 = "GainControl";

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public static final String f238965j2 = "ThumbnailImage";

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final short f238966j3 = 4;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public static final short f238967j4 = 3;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public static final short f238968j5 = 1;

    /* JADX INFO: renamed from: j6, reason: collision with root package name */
    public static final int f238969j6 = 10;

    /* JADX INFO: renamed from: j7, reason: collision with root package name */
    public static final Charset f238970j7;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f238971k0 = "UserComment";

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final String f238972k1 = "Contrast";

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public static final String f238973k2 = "PreviewImageStart";

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final short f238974k3 = 5;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public static final short f238975k4 = 1;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public static final int f238976k5 = 1;

    /* JADX INFO: renamed from: k6, reason: collision with root package name */
    public static final int f238977k6 = 4;

    /* JADX INFO: renamed from: k7, reason: collision with root package name */
    public static final byte[] f238978k7;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f238979l0 = "RelatedSoundFile";

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final String f238980l1 = "Saturation";

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public static final String f238981l2 = "PreviewImageLength";

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final short f238982l3 = 6;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public static final short f238983l4 = 0;

    /* JADX INFO: renamed from: l5, reason: collision with root package name */
    public static final int f238984l5 = 2;

    /* JADX INFO: renamed from: l6, reason: collision with root package name */
    public static final int f238985l6 = 4;

    /* JADX INFO: renamed from: l7, reason: collision with root package name */
    public static final byte[] f238986l7;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f238987m0 = "DateTimeOriginal";

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final String f238988m1 = "Sharpness";

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public static final String f238989m2 = "AspectFrame";

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final short f238990m3 = 7;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public static final short f238991m4 = 1;

    /* JADX INFO: renamed from: m5, reason: collision with root package name */
    public static final int f238992m5 = 6;

    /* JADX INFO: renamed from: m6, reason: collision with root package name */
    public static SimpleDateFormat f238993m6 = null;

    /* JADX INFO: renamed from: m7, reason: collision with root package name */
    public static final byte f238994m7 = -1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final String f238995n0 = "DateTimeDigitized";

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final String f238996n1 = "DeviceSettingDescription";

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public static final String f238997n2 = "SensorBottomBorder";

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final short f238998n3 = 0;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    public static final short f238999n4 = 0;

    /* JADX INFO: renamed from: n5, reason: collision with root package name */
    public static final int f239000n5 = 7;

    /* JADX INFO: renamed from: n6, reason: collision with root package name */
    public static SimpleDateFormat f239001n6 = null;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f239003o0 = "OffsetTime";

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final String f239004o1 = "SubjectDistanceRange";

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public static final String f239005o2 = "SensorLeftBorder";

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final short f239006o3 = 1;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    public static final short f239007o4 = 1;

    /* JADX INFO: renamed from: o5, reason: collision with root package name */
    public static final int f239008o5 = 8;

    /* JADX INFO: renamed from: o6, reason: collision with root package name */
    public static final short f239009o6 = 18761;

    /* JADX INFO: renamed from: o7, reason: collision with root package name */
    public static final byte f239010o7 = -64;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f239011p0 = "OffsetTimeOriginal";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final String f239012p1 = "ImageUniqueID";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final String f239013p2 = "SensorRightBorder";

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final short f239014p3 = 2;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    public static final short f239015p4 = 2;

    /* JADX INFO: renamed from: p5, reason: collision with root package name */
    public static final int f239016p5 = 32773;

    /* JADX INFO: renamed from: p6, reason: collision with root package name */
    public static final short f239017p6 = 19789;

    /* JADX INFO: renamed from: p7, reason: collision with root package name */
    public static final byte f239018p7 = -63;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f239019q0 = "OffsetTimeDigitized";

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    @Deprecated
    public static final String f239020q1 = "CameraOwnerName";

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public static final String f239021q2 = "SensorTopBorder";

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public static final short f239022q3 = 3;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    @Deprecated
    public static final int f239023q4 = 0;

    /* JADX INFO: renamed from: q5, reason: collision with root package name */
    public static final int f239024q5 = 34892;

    /* JADX INFO: renamed from: q7, reason: collision with root package name */
    public static final byte f239026q7 = -62;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f239027r0 = "SubSecTime";

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final String f239028r1 = "CameraOwnerName";

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public static final String f239029r2 = "ISO";

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public static final short f239030r3 = 4;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    @Deprecated
    public static final int f239031r4 = 1;

    /* JADX INFO: renamed from: r6, reason: collision with root package name */
    public static final int f239033r6 = 8;

    /* JADX INFO: renamed from: r7, reason: collision with root package name */
    public static final byte f239034r7 = -61;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f239035s0 = "SubSecTimeOriginal";

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final String f239036s1 = "BodySerialNumber";

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public static final String f239037s2 = "JpgFromRaw";

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public static final short f239038s3 = 5;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    public static final short f239039s4 = 0;

    /* JADX INFO: renamed from: s6, reason: collision with root package name */
    public static final int f239041s6 = 1;

    /* JADX INFO: renamed from: s7, reason: collision with root package name */
    public static final byte f239042s7 = -59;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f239043t0 = "SubSecTimeDigitized";

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final String f239044t1 = "LensSpecification";

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public static final String f239045t2 = "Xmp";

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public static final short f239046t3 = 6;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    public static final short f239047t4 = 1;

    /* JADX INFO: renamed from: t6, reason: collision with root package name */
    public static final int f239049t6 = 2;

    /* JADX INFO: renamed from: t7, reason: collision with root package name */
    public static final byte f239050t7 = -58;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f239051u0 = "ExposureTime";

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final String f239052u1 = "LensMake";

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public static final String f239053u2 = "NewSubfileType";

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public static final short f239054u3 = 255;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public static final short f239055u4 = 0;

    /* JADX INFO: renamed from: u5, reason: collision with root package name */
    public static final int f239056u5 = 0;

    /* JADX INFO: renamed from: u6, reason: collision with root package name */
    public static final int f239057u6 = 3;

    /* JADX INFO: renamed from: u7, reason: collision with root package name */
    public static final byte f239058u7 = -57;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final String f239060v0 = "FNumber";

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final String f239061v1 = "LensModel";

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public static final String f239062v2 = "SubfileType";

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static final short f239063v3 = 0;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    public static final short f239064v4 = 1;

    /* JADX INFO: renamed from: v5, reason: collision with root package name */
    public static final int f239065v5 = 1;

    /* JADX INFO: renamed from: v6, reason: collision with root package name */
    public static final int f239066v6 = 4;

    /* JADX INFO: renamed from: v7, reason: collision with root package name */
    public static final byte f239067v7 = -55;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final String f239069w0 = "ExposureProgram";

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final String f239070w1 = "LensSerialNumber";

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public static final String f239071w2 = "ExifIFDPointer";

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public static final short f239072w3 = 1;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    public static final short f239073w4 = 2;

    /* JADX INFO: renamed from: w5, reason: collision with root package name */
    public static final int f239074w5 = 2;

    /* JADX INFO: renamed from: w6, reason: collision with root package name */
    public static final int f239075w6 = 5;

    /* JADX INFO: renamed from: w7, reason: collision with root package name */
    public static final byte f239076w7 = -54;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f239077x = "ImageWidth";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String f239078x0 = "SpectralSensitivity";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final String f239079x1 = "GPSVersionID";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f239080x2 = "GPSInfoIFDPointer";

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public static final short f239081x3 = 2;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public static final short f239082x4 = 3;

    /* JADX INFO: renamed from: x5, reason: collision with root package name */
    public static final int f239083x5 = 6;

    /* JADX INFO: renamed from: x6, reason: collision with root package name */
    public static final int f239084x6 = 6;

    /* JADX INFO: renamed from: x7, reason: collision with root package name */
    public static final byte f239085x7 = -53;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f239086y = "ImageLength";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Deprecated
    public static final String f239087y0 = "ISOSpeedRatings";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final String f239088y1 = "GPSLatitudeRef";

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final String f239089y2 = "InteroperabilityIFDPointer";

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public static final short f239090y3 = 3;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    public static final short f239091y4 = 0;

    /* JADX INFO: renamed from: y5, reason: collision with root package name */
    public static final int f239092y5 = 0;

    /* JADX INFO: renamed from: y6, reason: collision with root package name */
    public static final int f239093y6 = 7;

    /* JADX INFO: renamed from: y7, reason: collision with root package name */
    public static final byte f239094y7 = -51;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f239095z = "BitsPerSample";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f239096z0 = "PhotographicSensitivity";

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final String f239097z1 = "GPSLatitude";

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public static final String f239098z2 = "SubIFDPointer";

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final short f239099z3 = 4;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public static final short f239100z4 = 1;

    /* JADX INFO: renamed from: z5, reason: collision with root package name */
    public static final int f239101z5 = 1;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public static final int f239102z6 = 8;

    /* JADX INFO: renamed from: z7, reason: collision with root package name */
    public static final byte f239103z7 = -50;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f239104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileDescriptor f239105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AssetManager.AssetInputStream f239106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f239107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f239108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<String, d>[] f239109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Set<Integer> f239110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteOrder f239111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f239112i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f239113j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f239114k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f239115l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f239116m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f239117n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f239118o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f239119p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f239120q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f239121r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f239122s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f239123t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f239124u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f239059v = "ExifInterface";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final boolean f239068w = Log.isLoggable(f239059v, 3);

    /* JADX INFO: renamed from: M2, reason: collision with root package name */
    public static final List<Integer> f238769M2 = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: N2, reason: collision with root package name */
    public static final List<Integer> f238778N2 = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: r5, reason: collision with root package name */
    public static final int[] f239032r5 = {8, 8, 8};

    /* JADX INFO: renamed from: s5, reason: collision with root package name */
    public static final int[] f239040s5 = {4};

    /* JADX INFO: renamed from: t5, reason: collision with root package name */
    public static final int[] f239048t5 = {8};

    /* JADX INFO: renamed from: n7, reason: collision with root package name */
    public static final byte f239002n7 = -40;

    /* JADX INFO: renamed from: D5, reason: collision with root package name */
    public static final byte[] f238691D5 = {-1, f239002n7, -1};

    /* JADX INFO: renamed from: G5, reason: collision with root package name */
    public static final byte[] f238718G5 = {102, 116, 121, 112};

    /* JADX INFO: renamed from: H5, reason: collision with root package name */
    public static final byte[] f238727H5 = {109, 105, 102, 49};

    /* JADX INFO: renamed from: I5, reason: collision with root package name */
    public static final byte[] f238736I5 = {104, 101, 105, 99};

    /* JADX INFO: renamed from: L5, reason: collision with root package name */
    public static final byte[] f238763L5 = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: M5, reason: collision with root package name */
    public static final byte[] f238772M5 = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: S5, reason: collision with root package name */
    public static final byte[] f238826S5 = {-119, 80, 78, 71, 13, 10, Ascii.SUB, 10};

    /* JADX INFO: renamed from: T5, reason: collision with root package name */
    public static final byte[] f238835T5 = {101, 88, 73, 102};

    /* JADX INFO: renamed from: U5, reason: collision with root package name */
    public static final byte[] f238844U5 = {73, 72, 68, 82};

    /* JADX INFO: renamed from: V5, reason: collision with root package name */
    public static final byte[] f238853V5 = {73, 69, 78, 68};

    /* JADX INFO: renamed from: Y5, reason: collision with root package name */
    public static final byte[] f238880Y5 = {82, 73, 70, 70};

    /* JADX INFO: renamed from: Z5, reason: collision with root package name */
    public static final byte[] f238889Z5 = {87, 69, 66, 80};

    /* JADX INFO: renamed from: b6, reason: collision with root package name */
    public static final byte[] f238905b6 = {69, 88, 73, 70};

    /* JADX INFO: renamed from: q6, reason: collision with root package name */
    public static final byte f239025q6 = 42;

    /* JADX INFO: renamed from: c6, reason: collision with root package name */
    public static final byte[] f238913c6 = {-99, 1, f239025q6};

    /* JADX INFO: renamed from: e6, reason: collision with root package name */
    public static final byte[] f238929e6 = "VP8X".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: f6, reason: collision with root package name */
    public static final byte[] f238937f6 = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: g6, reason: collision with root package name */
    public static final byte[] f238945g6 = "VP8 ".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: h6, reason: collision with root package name */
    public static final byte[] f238953h6 = "ANIM".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: i6, reason: collision with root package name */
    public static final byte[] f238961i6 = "ANMF".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: G6, reason: collision with root package name */
    public static final String[] f238719G6 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: H6, reason: collision with root package name */
    public static final int[] f238728H6 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: I6, reason: collision with root package name */
    public static final byte[] f238737I6 = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: t1.b$b, reason: collision with other inner class name */
    public static class C0888b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final ByteOrder f239128e = ByteOrder.LITTLE_ENDIAN;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final ByteOrder f239129f = ByteOrder.BIG_ENDIAN;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataInputStream f239130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ByteOrder f239131b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f239132c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f239133d;

        public C0888b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f239130a.available();
        }

        public int d() {
            return this.f239132c;
        }

        public long k() throws IOException {
            return ((long) readInt()) & ZipKt.f225990j;
        }

        public void l(ByteOrder byteOrder) {
            this.f239131b = byteOrder;
        }

        public void m(int i10) throws IOException {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int iSkip = (int) this.f239130a.skip(i12);
                if (iSkip <= 0) {
                    if (this.f239133d == null) {
                        this.f239133d = new byte[8192];
                    }
                    iSkip = this.f239130a.read(this.f239133d, 0, Math.min(8192, i12));
                    if (iSkip == -1) {
                        throw new EOFException(N0.a("Reached EOF while skipping ", i10, " bytes."));
                    }
                }
                i11 += iSkip;
            }
            this.f239132c += i11;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f239132c++;
            return this.f239130a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f239132c++;
            return this.f239130a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f239132c++;
            int i10 = this.f239130a.read();
            if (i10 >= 0) {
                return (byte) i10;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f239132c += 2;
            return this.f239130a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) throws IOException {
            this.f239132c += i11;
            this.f239130a.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f239132c += 4;
            int i10 = this.f239130a.read();
            int i11 = this.f239130a.read();
            int i12 = this.f239130a.read();
            int i13 = this.f239130a.read();
            if ((i10 | i11 | i12 | i13) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f239131b;
            if (byteOrder == f239128e) {
                return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
            }
            if (byteOrder == f239129f) {
                return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
            }
            throw new IOException("Invalid byte order: " + this.f239131b);
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d(b.f239059v, "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f239132c += 8;
            int i10 = this.f239130a.read();
            int i11 = this.f239130a.read();
            int i12 = this.f239130a.read();
            int i13 = this.f239130a.read();
            int i14 = this.f239130a.read();
            int i15 = this.f239130a.read();
            int i16 = this.f239130a.read();
            int i17 = this.f239130a.read();
            if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f239131b;
            if (byteOrder == f239128e) {
                return (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8) + ((long) i10);
            }
            if (byteOrder == f239129f) {
                return (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8) + ((long) i17);
            }
            throw new IOException("Invalid byte order: " + this.f239131b);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f239132c += 2;
            int i10 = this.f239130a.read();
            int i11 = this.f239130a.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f239131b;
            if (byteOrder == f239128e) {
                return (short) ((i11 << 8) + i10);
            }
            if (byteOrder == f239129f) {
                return (short) ((i10 << 8) + i11);
            }
            throw new IOException("Invalid byte order: " + this.f239131b);
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f239132c += 2;
            return this.f239130a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f239132c++;
            return this.f239130a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f239132c += 2;
            int i10 = this.f239130a.read();
            int i11 = this.f239130a.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f239131b;
            if (byteOrder == f239128e) {
                return (i11 << 8) + i10;
            }
            if (byteOrder == f239129f) {
                return (i10 << 8) + i11;
            }
            throw new IOException("Invalid byte order: " + this.f239131b);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public C0888b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public C0888b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f239131b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f239130a = dataInputStream;
            dataInputStream.mark(0);
            this.f239132c = 0;
            this.f239131b = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f239130a.read(bArr, i10, i11);
            this.f239132c += i12;
            return i12;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f239132c += bArr.length;
            this.f239130a.readFully(bArr);
        }
    }

    public static class c extends FilterOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutputStream f239134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ByteOrder f239135b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f239134a = outputStream;
            this.f239135b = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.f239135b = byteOrder;
        }

        public void b(int i10) throws IOException {
            this.f239134a.write(i10);
        }

        public void c(int i10) throws IOException {
            ByteOrder byteOrder = this.f239135b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f239134a.write(i10 & 255);
                this.f239134a.write((i10 >>> 8) & 255);
                this.f239134a.write((i10 >>> 16) & 255);
                this.f239134a.write((i10 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f239134a.write((i10 >>> 24) & 255);
                this.f239134a.write((i10 >>> 16) & 255);
                this.f239134a.write((i10 >>> 8) & 255);
                this.f239134a.write(i10 & 255);
            }
        }

        public void d(short s10) throws IOException {
            ByteOrder byteOrder = this.f239135b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f239134a.write(s10 & 255);
                this.f239134a.write((s10 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f239134a.write((s10 >>> 8) & 255);
                this.f239134a.write(s10 & 255);
            }
        }

        public void f(long j10) throws IOException {
            c((int) j10);
        }

        public void g(int i10) throws IOException {
            d((short) i10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f239134a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.f239134a.write(bArr, i10, i11);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f239136e = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f239137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f239138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f239139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f239140d;

        public d(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(b.f238970j7);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double d10, ByteOrder byteOrder) {
            return c(new double[]{d10}, byteOrder);
        }

        public static d c(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[b.f238728H6[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d10 : dArr) {
                byteBufferWrap.putDouble(d10);
            }
            return new d(12, dArr.length, byteBufferWrap.array());
        }

        public static d d(int i10, ByteOrder byteOrder) {
            return e(new int[]{i10}, byteOrder);
        }

        public static d e(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[b.f238728H6[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putInt(i10);
            }
            return new d(9, iArr.length, byteBufferWrap.array());
        }

        public static d f(h hVar, ByteOrder byteOrder) {
            return g(new h[]{hVar}, byteOrder);
        }

        public static d g(h[] hVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[b.f238728H6[10] * hVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (h hVar : hVarArr) {
                byteBufferWrap.putInt((int) hVar.f239145a);
                byteBufferWrap.putInt((int) hVar.f239146b);
            }
            return new d(10, hVarArr.length, byteBufferWrap.array());
        }

        public static d h(String str) {
            byte[] bytes = (str + (char) 0).getBytes(b.f238970j7);
            return new d(2, bytes.length, bytes);
        }

        public static d i(long j10, ByteOrder byteOrder) {
            return j(new long[]{j10}, byteOrder);
        }

        public static d j(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[b.f238728H6[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j10 : jArr) {
                byteBufferWrap.putInt((int) j10);
            }
            return new d(4, jArr.length, byteBufferWrap.array());
        }

        public static d k(h hVar, ByteOrder byteOrder) {
            return l(new h[]{hVar}, byteOrder);
        }

        public static d l(h[] hVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[b.f238728H6[5] * hVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (h hVar : hVarArr) {
                byteBufferWrap.putInt((int) hVar.f239145a);
                byteBufferWrap.putInt((int) hVar.f239146b);
            }
            return new d(5, hVarArr.length, byteBufferWrap.array());
        }

        public static d m(int i10, ByteOrder byteOrder) {
            return n(new int[]{i10}, byteOrder);
        }

        public static d n(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[b.f238728H6[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putShort((short) i10);
            }
            return new d(3, iArr.length, byteBufferWrap.array());
        }

        public double o(ByteOrder byteOrder) throws Throwable {
            Object objR = r(byteOrder);
            if (objR == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objR instanceof String) {
                return Double.parseDouble((String) objR);
            }
            if (objR instanceof long[]) {
                if (((long[]) objR).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objR instanceof int[]) {
                if (((int[]) objR).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objR instanceof double[]) {
                double[] dArr = (double[]) objR;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objR instanceof h[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            h[] hVarArr = (h[]) objR;
            if (hVarArr.length == 1) {
                return hVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int p(ByteOrder byteOrder) throws Throwable {
            Object objR = r(byteOrder);
            if (objR == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objR instanceof String) {
                return Integer.parseInt((String) objR);
            }
            if (objR instanceof long[]) {
                long[] jArr = (long[]) objR;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objR instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objR;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String q(ByteOrder byteOrder) throws Throwable {
            Object objR = r(byteOrder);
            if (objR == null) {
                return null;
            }
            if (objR instanceof String) {
                return (String) objR;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (objR instanceof long[]) {
                long[] jArr = (long[]) objR;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objR instanceof int[]) {
                int[] iArr = (int[]) objR;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objR instanceof double[]) {
                double[] dArr = (double[]) objR;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(objR instanceof h[])) {
                return null;
            }
            h[] hVarArr = (h[]) objR;
            while (i10 < hVarArr.length) {
                sb2.append(hVarArr[i10].f239145a);
                sb2.append('/');
                sb2.append(hVarArr[i10].f239146b);
                i10++;
                if (i10 != hVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x002f: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:48), block:B:18:0x002f */
        /* JADX WARN: Removed duplicated region for block: B:112:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object r(java.nio.ByteOrder r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 368
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: t1.b.d.r(java.nio.ByteOrder):java.lang.Object");
        }

        public int s() {
            return b.f238728H6[this.f239137a] * this.f239138b;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("(");
            sb2.append(b.f238719G6[this.f239137a]);
            sb2.append(", data length:");
            return android.support.v4.media.d.a(sb2, this.f239140d.length, ")");
        }

        public d(int i10, int i11, long j10, byte[] bArr) {
            this.f239137a = i10;
            this.f239138b = i11;
            this.f239139c = j10;
            this.f239140d = bArr;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface g {
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f239145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f239146b;

        public h(double d10) {
            this((long) (d10 * 10000.0d), 10000L);
        }

        public double a() {
            return this.f239145a / this.f239146b;
        }

        public String toString() {
            return this.f239145a + RemoteSettings.FORWARD_SLASH_STRING + this.f239146b;
        }

        public h(long j10, long j11) {
            if (j11 == 0) {
                this.f239145a = 0L;
                this.f239146b = 1L;
            } else {
                this.f239145a = j10;
                this.f239146b = j11;
            }
        }
    }

    static {
        f[] fVarArr = {new f(f239053u2, f3.d.f200563l, 4), new f(f239062v2, 255, 4), new f(f239077x, 256, 3, 4), new f(f239086y, 257, 3, 4), new f(f239095z, com.prism.gaia.helper.utils.apk.b.f165083c, 3), new f(f238658A, com.prism.gaia.helper.utils.apk.b.f165084d, 3), new f(f238667B, 262, 3), new f(f238847V, 270, 2), new f(f238856W, 271, 2), new f(f238865X, 272, 2), new f(f238748K, AudioAttributesCompat.f114436O, 3, 4), new f(f238676C, DefaultImageHeaderParser.f139857n, 3), new f(f238685D, 277, 3), new f(f238757L, 278, 3, 4), new f(f238766M, 279, 3, 4), new f(f238721H, 282, 5), new f(f238730I, 283, 5), new f(f238694E, 284, 3), new f(f238739J, 296, 3), new f(f238793P, 301, 3), new f(f238874Y, 305, 2), new f(f238838U, 306, 2), new f(f238883Z, 315, 2), new f(f238802Q, x.a.f238252s, 5), new f(f238811R, 319, 5), new f(f239098z2, 330, 4), new f(f238775N, 513, 4), new f(f238784O, com.prism.gaia.helper.utils.apk.b.f165087g, 4), new f(f238820S, 529, 5), new f(f238703F, 530, 3), new f(f238712G, 531, 3), new f(f238829T, 532, 5), new f(f238891a0, 33432, 2), new f(f239071w2, 34665, 4), new f(f239080x2, 34853, 4), new f(f239021q2, 4, 4), new f(f239005o2, 5, 4), new f(f238997n2, 6, 4), new f(f239013p2, 7, 4), new f(f239029r2, 23, 3), new f(f239037s2, 46, 7), new f(f239045t2, x.h.f238407j, 1)};
        f238746J6 = fVarArr;
        f[] fVarArr2 = {new f(f239051u0, 33434, 5), new f(f239060v0, 33437, 5), new f(f239069w0, 34850, 3), new f(f239078x0, 34852, 2), new f(f239096z0, 34855, 3), new f(f238659A0, 34856, 7), new f(f238668B0, 34864, 3), new f(f238677C0, 34865, 4), new f(f238686D0, 34866, 4), new f(f238695E0, 34867, 4), new f(f238704F0, 34868, 4), new f(f238713G0, 34869, 4), new f(f238899b0, 36864, 2), new f(f238987m0, 36867, 2), new f(f238995n0, 36868, 2), new f(f239003o0, 36880, 2), new f(f239011p0, 36881, 2), new f(f239019q0, 36882, 2), new f(f238947h0, 37121, 7), new f(f238955i0, 37122, 5), new f(f238722H0, 37377, 10), new f(f238731I0, 37378, 5), new f(f238740J0, 37379, 10), new f(f238749K0, 37380, 10), new f(f238758L0, 37381, 5), new f(f238767M0, 37382, 5), new f(f238776N0, 37383, 3), new f(f238785O0, 37384, 3), new f(f238794P0, 37385, 3), new f(f238812R0, 37386, 5), new f(f238803Q0, 37396, 3), new f(f238963j0, 37500, 7), new f(f238971k0, 37510, 7), new f(f239027r0, 37520, 2), new f(f239035s0, 37521, 2), new f(f239043t0, 37522, 2), new f(f238907c0, 40960, 7), new f(f238915d0, 40961, 3), new f(f238931f0, 40962, 3, 4), new f(f238939g0, 40963, 3, 4), new f(f238979l0, 40964, 2), new f(f239089y2, 40965, 4), new f(f238821S0, 41483, 5), new f(f238830T0, 41484, 7), new f(f238839U0, 41486, 5), new f(f238848V0, 41487, 5), new f(f238857W0, 41488, 3), new f(f238866X0, 41492, 3), new f(f238875Y0, 41493, 5), new f(f238884Z0, 41495, 3), new f(f238892a1, 41728, 7), new f(f238900b1, 41729, 7), new f(f238908c1, 41730, 7), new f(f238916d1, 41985, 3), new f(f238924e1, 41986, 3), new f(f238932f1, 41987, 3), new f(f238940g1, 41988, 5), new f(f238948h1, 41989, 3), new f(f238956i1, 41990, 3), new f(f238964j1, 41991, 3), new f(f238972k1, 41992, 3), new f(f238980l1, 41993, 3), new f(f238988m1, 41994, 3), new f(f238996n1, 41995, 7), new f(f239004o1, 41996, 3), new f(f239012p1, 42016, 2), new f("CameraOwnerName", 42032, 2), new f(f239036s1, 42033, 2), new f(f239044t1, 42034, 5), new f(f239052u1, 42035, 2), new f(f239061v1, 42036, 2), new f(f238923e0, 42240, 5), new f(f238949h2, 50706, 1), new f(f238957i2, 50720, 3, 4)};
        f238755K6 = fVarArr2;
        f[] fVarArr3 = {new f(f239079x1, 0, 1), new f(f239088y1, 1, 2), new f(f239097z1, 2, 5, 10), new f(f238660A1, 3, 2), new f(f238669B1, 4, 5, 10), new f(f238678C1, 5, 1), new f(f238687D1, 6, 5), new f(f238696E1, 7, 5), new f(f238705F1, 8, 2), new f(f238714G1, 9, 2), new f(f238723H1, 10, 2), new f(f238732I1, 11, 5), new f(f238741J1, 12, 2), new f(f238750K1, 13, 5), new f(f238759L1, 14, 2), new f(f238768M1, 15, 5), new f(f238777N1, 16, 2), new f(f238786O1, 17, 5), new f(f238795P1, 18, 2), new f(f238804Q1, 19, 2), new f(f238813R1, 20, 5), new f(f238822S1, 21, 2), new f(f238831T1, 22, 5), new f(f238840U1, 23, 2), new f(f238849V1, 24, 5), new f(f238858W1, 25, 2), new f(f238867X1, 26, 5), new f(f238876Y1, 27, 7), new f(f238885Z1, 28, 7), new f(f238893a2, 29, 2), new f(f238901b2, 30, 3), new f(f238909c2, 31, 5)};
        f238764L6 = fVarArr3;
        f[] fVarArr4 = {new f(f238917d2, 1, 2)};
        f238773M6 = fVarArr4;
        f[] fVarArr5 = {new f(f239053u2, f3.d.f200563l, 4), new f(f239062v2, 255, 4), new f(f238933f2, 256, 3, 4), new f(f238925e2, 257, 3, 4), new f(f239095z, com.prism.gaia.helper.utils.apk.b.f165083c, 3), new f(f238658A, com.prism.gaia.helper.utils.apk.b.f165084d, 3), new f(f238667B, 262, 3), new f(f238847V, 270, 2), new f(f238856W, 271, 2), new f(f238865X, 272, 2), new f(f238748K, AudioAttributesCompat.f114436O, 3, 4), new f(f238941g2, DefaultImageHeaderParser.f139857n, 3), new f(f238685D, 277, 3), new f(f238757L, 278, 3, 4), new f(f238766M, 279, 3, 4), new f(f238721H, 282, 5), new f(f238730I, 283, 5), new f(f238694E, 284, 3), new f(f238739J, 296, 3), new f(f238793P, 301, 3), new f(f238874Y, 305, 2), new f(f238838U, 306, 2), new f(f238883Z, 315, 2), new f(f238802Q, x.a.f238252s, 5), new f(f238811R, 319, 5), new f(f239098z2, 330, 4), new f(f238775N, 513, 4), new f(f238784O, com.prism.gaia.helper.utils.apk.b.f165087g, 4), new f(f238820S, 529, 5), new f(f238703F, 530, 3), new f(f238712G, 531, 3), new f(f238829T, 532, 5), new f(f238891a0, 33432, 2), new f(f239071w2, 34665, 4), new f(f239080x2, 34853, 4), new f(f238949h2, 50706, 1), new f(f238957i2, 50720, 3, 4)};
        f238782N6 = fVarArr5;
        f238791O6 = new f(f238748K, AudioAttributesCompat.f114436O, 3);
        f[] fVarArr6 = {new f(f238965j2, 256, 7), new f(f238661A2, 8224, 4), new f(f238670B2, 8256, 4)};
        f238800P6 = fVarArr6;
        f[] fVarArr7 = {new f(f238973k2, 257, 4), new f(f238981l2, com.prism.gaia.helper.utils.apk.b.f165083c, 4)};
        f238809Q6 = fVarArr7;
        f[] fVarArr8 = {new f(f238989m2, 4371, 3)};
        f238818R6 = fVarArr8;
        f[] fVarArr9 = {new f(f238915d0, 55, 3)};
        f238827S6 = fVarArr9;
        f[][] fVarArr10 = {fVarArr, fVarArr2, fVarArr3, fVarArr4, fVarArr5, fVarArr, fVarArr6, fVarArr7, fVarArr8, fVarArr9};
        f238922d7 = fVarArr10;
        f238930e7 = new f[]{new f(f239098z2, 330, 4), new f(f239071w2, 34665, 4), new f(f239080x2, 34853, 4), new f(f239089y2, 40965, 4), new f(f238661A2, 8224, 1), new f(f238670B2, 8256, 1)};
        f238938f7 = new HashMap[fVarArr10.length];
        f238946g7 = new HashMap[fVarArr10.length];
        f238954h7 = new HashSet<>(Arrays.asList(f239060v0, f238940g1, f239051u0, f238767M0, f238696E1));
        f238962i7 = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f238970j7 = charsetForName;
        f238978k7 = DefaultImageHeaderParser.f139851h.getBytes(charsetForName);
        f238986l7 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f238993m6 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f239001n6 = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            f[][] fVarArr11 = f238922d7;
            if (i10 >= fVarArr11.length) {
                HashMap<Integer, Integer> map = f238962i7;
                f[] fVarArr12 = f238930e7;
                map.put(Integer.valueOf(fVarArr12[0].f239141a), 5);
                map.put(Integer.valueOf(fVarArr12[1].f239141a), 1);
                map.put(Integer.valueOf(fVarArr12[2].f239141a), 2);
                map.put(Integer.valueOf(fVarArr12[3].f239141a), 3);
                map.put(Integer.valueOf(fVarArr12[4].f239141a), 7);
                map.put(Integer.valueOf(fVarArr12[5].f239141a), 8);
                f238846U7 = Pattern.compile(".*[1-9].*");
                f238855V7 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f238864W7 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f238873X7 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f238938f7[i10] = new HashMap<>();
            f238946g7[i10] = new HashMap<>();
            for (f fVar : fVarArr11[i10]) {
                f238938f7[i10].put(Integer.valueOf(fVar.f239141a), fVar);
                f238946g7[i10].put(fVar.f239142b, fVar);
            }
            i10++;
        }
    }

    public b(@NonNull File file) throws Throwable {
        f[][] fVarArr = f238922d7;
        this.f239109f = new HashMap[fVarArr.length];
        this.f239110g = new HashSet(fVarArr.length);
        this.f239111h = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        O(file.getAbsolutePath());
    }

    public static boolean A0(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    public static Pair<Integer, Integer> J(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairJ = J(strArrSplit[0]);
            if (((Integer) pairJ.first).intValue() == 2) {
                return pairJ;
            }
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                Pair<Integer, Integer> pairJ2 = J(strArrSplit[i10]);
                int iIntValue = (((Integer) pairJ2.first).equals(pairJ.first) || ((Integer) pairJ2.second).equals(pairJ.first)) ? ((Integer) pairJ.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairJ.second).intValue() == -1 || !(((Integer) pairJ2.first).equals(pairJ.second) || ((Integer) pairJ2.second).equals(pairJ.second))) ? -1 : ((Integer) pairJ.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairJ = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairJ = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairJ;
        }
        if (!str.contains(RemoteSettings.FORWARD_SLASH_STRING)) {
            try {
                try {
                    long j10 = Long.parseLong(str);
                    return (j10 < 0 || j10 > Nd.g.f65032t) ? j10 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
        String[] strArrSplit2 = str.split(RemoteSettings.FORWARD_SLASH_STRING, -1);
        if (strArrSplit2.length == 2) {
            try {
                long j11 = (long) Double.parseDouble(strArrSplit2[0]);
                long j12 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j11 >= 0 && j12 >= 0) {
                    if (j11 <= LruCacheKt.f86729a && j12 <= LruCacheKt.f86729a) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    public static boolean P(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f238978k7;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = f238978k7;
            if (i10 >= bArr3.length) {
                return true;
            }
            if (bArr2[i10] != bArr3[i10]) {
                return false;
            }
            i10++;
        }
    }

    public static boolean S(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f238691D5;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    public static boolean X(FileDescriptor fileDescriptor) {
        try {
            c.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f239068w) {
                return false;
            }
            Log.d(f239059v, "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    public static boolean Z(int i10) {
        return i10 == 4 || i10 == 13 || i10 == 14;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean a0(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("mimeType shouldn't be null");
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        byte b10 = -1;
        switch (lowerCase.hashCode()) {
            case -1875291391:
                if (lowerCase.equals("image/x-fuji-raf")) {
                    b10 = 0;
                }
                break;
            case -1635437028:
                if (lowerCase.equals("image/x-samsung-srw")) {
                    b10 = 1;
                }
                break;
            case -1594371159:
                if (lowerCase.equals("image/x-sony-arw")) {
                    b10 = 2;
                }
                break;
            case -1487464693:
                if (lowerCase.equals("image/heic")) {
                    b10 = 3;
                }
                break;
            case -1487464690:
                if (lowerCase.equals("image/heif")) {
                    b10 = 4;
                }
                break;
            case -1487394660:
                if (lowerCase.equals("image/jpeg")) {
                    b10 = 5;
                }
                break;
            case -1487018032:
                if (lowerCase.equals("image/webp")) {
                    b10 = 6;
                }
                break;
            case -1423313290:
                if (lowerCase.equals("image/x-adobe-dng")) {
                    b10 = 7;
                }
                break;
            case -985160897:
                if (lowerCase.equals("image/x-panasonic-rw2")) {
                    b10 = 8;
                }
                break;
            case -879258763:
                if (lowerCase.equals("image/png")) {
                    b10 = 9;
                }
                break;
            case -332763809:
                if (lowerCase.equals("image/x-pentax-pef")) {
                    b10 = 10;
                }
                break;
            case 1378106698:
                if (lowerCase.equals("image/x-olympus-orf")) {
                    b10 = 11;
                }
                break;
            case 2099152104:
                if (lowerCase.equals("image/x-nikon-nef")) {
                    b10 = 12;
                }
                break;
            case 2099152524:
                if (lowerCase.equals("image/x-nikon-nrw")) {
                    b10 = 13;
                }
                break;
            case 2111234748:
                if (lowerCase.equals("image/x-canon-cr2")) {
                    b10 = Ascii.SO;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return true;
            default:
                return false;
        }
    }

    public static double c(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split(RemoteSettings.FORWARD_SLASH_STRING, -1);
            double d10 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split(RemoteSettings.FORWARD_SLASH_STRING, -1);
            double d11 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split(RemoteSettings.FORWARD_SLASH_STRING, -1);
            double d12 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d11 / 60.0d) + d10;
            if (!str2.equals(f238816R4) && !str2.equals(f238834T4)) {
                if (!str2.equals("N") && !str2.equals(f238825S4)) {
                    throw new IllegalArgumentException();
                }
                return d12;
            }
            return -d12;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static Long f0(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (str != null && f238846U7.matcher(str).matches()) {
            ParsePosition parsePosition = new ParsePosition(0);
            try {
                Date date = f238993m6.parse(str, parsePosition);
                if (date == null && (date = f239001n6.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = date.getTime();
                if (str3 != null) {
                    int i10 = 1;
                    String strSubstring = str3.substring(0, 1);
                    int i11 = Integer.parseInt(str3.substring(1, 3));
                    int i12 = Integer.parseInt(str3.substring(4, 6));
                    if (("+".equals(strSubstring) || com.prism.gaia.download.a.f164606q.equals(strSubstring)) && com.prism.gaia.server.accounts.b.f166434b0.equals(str3.substring(3, 4)) && i11 <= 14) {
                        int i13 = ((i11 * 60) + i12) * 60000;
                        if (!com.prism.gaia.download.a.f164606q.equals(strSubstring)) {
                            i10 = -1;
                        }
                        time += (long) (i13 * i10);
                    }
                }
                if (str2 != null) {
                    time += t1.c.g(str2);
                }
                return Long.valueOf(time);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public final void A(i iVar) throws Throwable {
        d dVar;
        g0(iVar);
        k0(iVar, 0);
        C0(iVar, 0);
        C0(iVar, 5);
        C0(iVar, 4);
        D0();
        if (this.f239107d != 8 || (dVar = this.f239109f[1].get(f238963j0)) == null) {
            return;
        }
        i iVar2 = new i(dVar.f239140d);
        iVar2.f239131b = this.f239111h;
        iVar2.m(6);
        k0(iVar2, 9);
        d dVar2 = this.f239109f[9].get(f238915d0);
        if (dVar2 != null) {
            this.f239109f[1].put(f238915d0, dVar2);
        }
    }

    public int B() {
        switch (l(f238676C, 1)) {
            case 3:
            case 4:
                return Opcodes.GETFIELD;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void B0(int i10, int i11) throws Throwable {
        if (this.f239109f[i10].isEmpty() || this.f239109f[i11].isEmpty()) {
            if (f239068w) {
                Log.d(f239059v, "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = this.f239109f[i10].get(f239086y);
        d dVar2 = this.f239109f[i10].get(f239077x);
        d dVar3 = this.f239109f[i11].get(f239086y);
        d dVar4 = this.f239109f[i11].get(f239077x);
        if (dVar == null || dVar2 == null) {
            if (f239068w) {
                Log.d(f239059v, "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (f239068w) {
                Log.d(f239059v, "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iP = dVar.p(this.f239111h);
        int iP2 = dVar2.p(this.f239111h);
        int iP3 = dVar3.p(this.f239111h);
        int iP4 = dVar4.p(this.f239111h);
        if (iP >= iP3 || iP2 >= iP4) {
            return;
        }
        HashMap<String, d>[] mapArr = this.f239109f;
        HashMap<String, d> map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    public final void C(i iVar) throws Throwable {
        if (f239068w) {
            Log.d(f239059v, "getRw2Attributes starting with: " + iVar);
        }
        A(iVar);
        d dVar = this.f239109f[0].get(f239037s2);
        if (dVar != null) {
            t(new C0888b(dVar.f239140d), (int) dVar.f239139c, 5);
        }
        d dVar2 = this.f239109f[0].get(f239029r2);
        d dVar3 = this.f239109f[1].get(f239096z0);
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f239109f[1].put(f239096z0, dVar2);
    }

    public final void C0(i iVar, int i10) throws Throwable {
        d dVarM;
        d dVarM2;
        d dVar = this.f239109f[i10].get(f238957i2);
        d dVar2 = this.f239109f[i10].get(f239021q2);
        d dVar3 = this.f239109f[i10].get(f239005o2);
        d dVar4 = this.f239109f[i10].get(f238997n2);
        d dVar5 = this.f239109f[i10].get(f239013p2);
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                o0(iVar, i10);
                return;
            }
            int iP = dVar2.p(this.f239111h);
            int iP2 = dVar4.p(this.f239111h);
            int iP3 = dVar5.p(this.f239111h);
            int iP4 = dVar3.p(this.f239111h);
            if (iP2 <= iP || iP3 <= iP4) {
                return;
            }
            d dVarM3 = d.m(iP2 - iP, this.f239111h);
            d dVarM4 = d.m(iP3 - iP4, this.f239111h);
            this.f239109f[i10].put(f239086y, dVarM3);
            this.f239109f[i10].put(f239077x, dVarM4);
            return;
        }
        if (dVar.f239137a == 5) {
            h[] hVarArr = (h[]) dVar.r(this.f239111h);
            if (hVarArr == null || hVarArr.length != 2) {
                Log.w(f239059v, "Invalid crop size values. cropSize=" + Arrays.toString(hVarArr));
                return;
            }
            dVarM = d.k(hVarArr[0], this.f239111h);
            dVarM2 = d.k(hVarArr[1], this.f239111h);
        } else {
            int[] iArr = (int[]) dVar.r(this.f239111h);
            if (iArr == null || iArr.length != 2) {
                Log.w(f239059v, "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            dVarM = d.m(iArr[0], this.f239111h);
            dVarM2 = d.m(iArr[1], this.f239111h);
        }
        this.f239109f[i10].put(f239077x, dVarM);
        this.f239109f[i10].put(f239086y, dVarM2);
    }

    public final void D(i iVar) throws IOException {
        byte[] bArr = f238978k7;
        iVar.m(bArr.length);
        byte[] bArr2 = new byte[iVar.available()];
        iVar.readFully(bArr2);
        this.f239119p = bArr.length;
        j0(bArr2, 0);
    }

    public final void D0() throws Throwable {
        B0(0, 5);
        B0(0, 4);
        B0(5, 4);
        d dVar = this.f239109f[1].get(f238931f0);
        d dVar2 = this.f239109f[1].get(f238939g0);
        if (dVar != null && dVar2 != null) {
            this.f239109f[0].put(f239077x, dVar);
            this.f239109f[0].put(f239086y, dVar2);
        }
        if (this.f239109f[4].isEmpty() && b0(this.f239109f[5])) {
            HashMap<String, d>[] mapArr = this.f239109f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (!b0(this.f239109f[4])) {
            Log.d(f239059v, "No image meets the size requirements of a thumbnail image.");
        }
        m0(0, f238941g2, f238676C);
        m0(0, f238925e2, f239086y);
        m0(0, f238933f2, f239077x);
        m0(5, f238941g2, f238676C);
        m0(5, f238925e2, f239086y);
        m0(5, f238933f2, f239077x);
        m0(4, f238676C, f238941g2);
        m0(4, f239086y, f238925e2);
        m0(4, f239077x, f238933f2);
    }

    @Nullable
    public byte[] E() {
        int i10 = this.f239118o;
        if (i10 == 6 || i10 == 7) {
            return G();
        }
        return null;
    }

    public final int E0(c cVar) throws IOException {
        char c10;
        char c11;
        f[][] fVarArr = f238922d7;
        int[] iArr = new int[fVarArr.length];
        int[] iArr2 = new int[fVarArr.length];
        for (f fVar : f238930e7) {
            l0(fVar.f239142b);
        }
        if (this.f239112i) {
            if (this.f239113j) {
                l0(f238748K);
                l0(f238766M);
            } else {
                l0(f238775N);
                l0(f238784O);
            }
        }
        for (int i10 = 0; i10 < f238922d7.length; i10++) {
            for (Object obj : this.f239109f[i10].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f239109f[i10].remove(entry.getKey());
                }
            }
        }
        int i11 = 1;
        if (!this.f239109f[1].isEmpty()) {
            this.f239109f[0].put(f238930e7[1].f239142b, d.i(0L, this.f239111h));
        }
        if (!this.f239109f[2].isEmpty()) {
            this.f239109f[0].put(f238930e7[2].f239142b, d.i(0L, this.f239111h));
        }
        if (this.f239109f[3].isEmpty()) {
            c10 = 2;
        } else {
            c10 = 2;
            this.f239109f[1].put(f238930e7[3].f239142b, d.i(0L, this.f239111h));
        }
        if (!this.f239112i) {
            c11 = 3;
        } else if (this.f239113j) {
            this.f239109f[4].put(f238748K, d.m(0, this.f239111h));
            this.f239109f[4].put(f238766M, d.m(this.f239116m, this.f239111h));
            c11 = 3;
        } else {
            this.f239109f[4].put(f238775N, d.i(0L, this.f239111h));
            c11 = 3;
            this.f239109f[4].put(f238784O, d.i(this.f239116m, this.f239111h));
        }
        for (int i12 = 0; i12 < f238922d7.length; i12++) {
            Iterator<Map.Entry<String, d>> it = this.f239109f[i12].entrySet().iterator();
            int i13 = 0;
            while (it.hasNext()) {
                int iS = it.next().getValue().s();
                if (iS > 4) {
                    i13 += iS;
                }
            }
            iArr2[i12] = iArr2[i12] + i13;
        }
        int size = 8;
        for (int i14 = 0; i14 < f238922d7.length; i14++) {
            if (!this.f239109f[i14].isEmpty()) {
                iArr[i14] = size;
                size = (this.f239109f[i14].size() * 12) + 6 + iArr2[i14] + size;
            }
        }
        if (this.f239112i) {
            if (this.f239113j) {
                this.f239109f[4].put(f238748K, d.m(size, this.f239111h));
            } else {
                this.f239109f[4].put(f238775N, d.i(size, this.f239111h));
            }
            this.f239115l = size;
            size += this.f239116m;
        }
        if (this.f239107d == 4) {
            size += 8;
        }
        if (f239068w) {
            int i15 = 0;
            while (i15 < f238922d7.length) {
                Integer numValueOf = Integer.valueOf(i15);
                Integer numValueOf2 = Integer.valueOf(iArr[i15]);
                Integer numValueOf3 = Integer.valueOf(this.f239109f[i15].size());
                Integer numValueOf4 = Integer.valueOf(iArr2[i15]);
                Integer numValueOf5 = Integer.valueOf(size);
                int i16 = i11;
                Object[] objArr = new Object[5];
                objArr[0] = numValueOf;
                objArr[i16] = numValueOf2;
                objArr[c10] = numValueOf3;
                objArr[c11] = numValueOf4;
                objArr[4] = numValueOf5;
                Log.d(f239059v, String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", objArr));
                i15++;
                i11 = i16;
            }
        }
        int i17 = i11;
        if (!this.f239109f[i17].isEmpty()) {
            this.f239109f[0].put(f238930e7[i17].f239142b, d.i(iArr[i17], this.f239111h));
        }
        if (!this.f239109f[c10].isEmpty()) {
            this.f239109f[0].put(f238930e7[c10].f239142b, d.i(iArr[c10], this.f239111h));
        }
        if (!this.f239109f[c11].isEmpty()) {
            this.f239109f[i17].put(f238930e7[c11].f239142b, d.i(iArr[c11], this.f239111h));
        }
        int i18 = this.f239107d;
        if (i18 == 4) {
            cVar.g(size);
            cVar.write(f238978k7);
        } else if (i18 == 13) {
            cVar.c(size);
            cVar.write(f238835T5);
        } else if (i18 == 14) {
            cVar.write(f238905b6);
            cVar.c(size);
        }
        cVar.d(this.f239111h == ByteOrder.BIG_ENDIAN ? f239017p6 : f239009o6);
        cVar.a(this.f239111h);
        cVar.g(42);
        cVar.f(8L);
        for (int i19 = 0; i19 < f238922d7.length; i19++) {
            if (!this.f239109f[i19].isEmpty()) {
                cVar.g(this.f239109f[i19].size());
                int size2 = (this.f239109f[i19].size() * 12) + iArr[i19] + 2 + 4;
                for (Map.Entry<String, d> entry2 : this.f239109f[i19].entrySet()) {
                    int i20 = f238946g7[i19].get(entry2.getKey()).f239141a;
                    d value = entry2.getValue();
                    int iS2 = value.s();
                    cVar.g(i20);
                    cVar.g(value.f239137a);
                    cVar.c(value.f239138b);
                    if (iS2 > 4) {
                        cVar.f(size2);
                        size2 += iS2;
                    } else {
                        cVar.write(value.f239140d);
                        if (iS2 < 4) {
                            while (iS2 < 4) {
                                cVar.b(0);
                                iS2++;
                            }
                        }
                    }
                }
                if (i19 != 0 || this.f239109f[4].isEmpty()) {
                    cVar.f(0L);
                } else {
                    cVar.f(iArr[4]);
                }
                Iterator<Map.Entry<String, d>> it2 = this.f239109f[i19].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f239140d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f239112i) {
            cVar.write(G());
        }
        if (this.f239107d == 14 && size % 2 == i17) {
            cVar.b(0);
        }
        cVar.a(ByteOrder.BIG_ENDIAN);
        return size;
    }

    @Nullable
    public Bitmap F() throws Throwable {
        if (!this.f239112i) {
            return null;
        }
        if (this.f239117n == null) {
            this.f239117n = G();
        }
        int i10 = this.f239118o;
        if (i10 == 6 || i10 == 7) {
            return BitmapFactory.decodeByteArray(this.f239117n, 0, this.f239116m);
        }
        if (i10 == 1) {
            int length = this.f239117n.length / 3;
            int[] iArr = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                byte[] bArr = this.f239117n;
                int i12 = i11 * 3;
                iArr[i11] = (bArr[i12] << 16) + (bArr[i12 + 1] << 8) + bArr[i12 + 2];
            }
            d dVar = this.f239109f[4].get(f238925e2);
            d dVar2 = this.f239109f[4].get(f238933f2);
            if (dVar != null && dVar2 != null) {
                return Bitmap.createBitmap(iArr, dVar2.p(this.f239111h), dVar.p(this.f239111h), Bitmap.Config.ARGB_8888);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] G() throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r9.f239112i
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            byte[] r1 = r9.f239117n
            if (r1 == 0) goto Ld
            return r1
        Ld:
            android.content.res.AssetManager$AssetInputStream r1 = r9.f239106c     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            if (r1 == 0) goto L2f
            boolean r3 = r1.markSupported()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
            if (r3 == 0) goto L26
            r1.reset()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
        L1a:
            r3 = r2
            goto L59
        L1c:
            r0 = move-exception
            r3 = r2
        L1e:
            r2 = r1
            goto Lab
        L21:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L9d
        L26:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
            t1.c.c(r1)
            return r2
        L2f:
            java.lang.String r1 = r9.f239104a     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            if (r1 == 0) goto L44
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            java.lang.String r3 = r9.f239104a     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            goto L1a
        L3b:
            r0 = move-exception
            r3 = r2
            goto Lab
        L3f:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
            goto L9d
        L44:
            java.io.FileDescriptor r1 = r9.f239105b     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            java.io.FileDescriptor r1 = t1.c.a.b(r1)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            int r3 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            r4 = 0
            t1.c.a.c(r1, r4, r3)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            r8 = r3
            r3 = r1
            r1 = r8
        L59:
            int r4 = r9.f239115l     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            int r5 = r9.f239119p     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            int r4 = r4 + r5
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            long r4 = r1.skip(r4)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            int r6 = r9.f239115l     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            int r7 = r9.f239119p     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            int r6 = r6 + r7
            long r6 = (long) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            java.lang.String r5 = "Corrupted image"
            if (r4 != 0) goto L90
            int r4 = r9.f239116m     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            int r6 = r1.read(r4)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            int r7 = r9.f239116m     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            if (r6 != r7) goto L8a
            r9.f239117n = r4     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            t1.c.c(r1)
            if (r3 == 0) goto L85
            t1.c.b(r3)
        L85:
            return r4
        L86:
            r0 = move-exception
            goto L1e
        L88:
            r4 = move-exception
            goto L9d
        L8a:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            throw r4     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
        L90:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            throw r4     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
        L96:
            r0 = move-exception
            r3 = r1
            goto Lab
        L99:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
        L9d:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch: java.lang.Throwable -> L86
            t1.c.c(r1)
            if (r3 == 0) goto Laa
            t1.c.b(r3)
        Laa:
            return r2
        Lab:
            t1.c.c(r2)
            if (r3 == 0) goto Lb3
            t1.c.b(r3)
        Lb3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.b.G():byte[]");
    }

    @Nullable
    public long[] H() {
        if (this.f239123t) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        if (!this.f239112i) {
            return null;
        }
        if (!this.f239113j || this.f239114k) {
            return new long[]{this.f239115l + this.f239119p, this.f239116m};
        }
        return null;
    }

    public final void I(C0888b c0888b) throws Throwable {
        if (f239068w) {
            Log.d(f239059v, "getWebpAttributes starting with: " + c0888b);
        }
        c0888b.l(ByteOrder.LITTLE_ENDIAN);
        c0888b.m(f238880Y5.length);
        int i10 = c0888b.readInt() + 8;
        byte[] bArr = f238889Z5;
        c0888b.m(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c0888b.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i11 = c0888b.readInt();
                int i12 = length + 8;
                if (Arrays.equals(f238905b6, bArr2)) {
                    byte[] bArr3 = new byte[i11];
                    if (c0888b.read(bArr3) == i11) {
                        this.f239119p = i12;
                        j0(bArr3, 0);
                        z0(new C0888b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + t1.c.a(bArr2));
                    }
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c0888b.m(i11);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void K(C0888b c0888b, HashMap map) throws Throwable {
        d dVar = (d) map.get(f238775N);
        d dVar2 = (d) map.get(f238784O);
        if (dVar == null || dVar2 == null) {
            return;
        }
        int iP = dVar.p(this.f239111h);
        int iP2 = dVar2.p(this.f239111h);
        if (this.f239107d == 7) {
            iP += this.f239120q;
        }
        if (iP > 0 && iP2 > 0) {
            this.f239112i = true;
            if (this.f239104a == null && this.f239106c == null && this.f239105b == null) {
                byte[] bArr = new byte[iP2];
                c0888b.skip(iP);
                c0888b.read(bArr);
                this.f239117n = bArr;
            }
            this.f239115l = iP;
            this.f239116m = iP2;
        }
        if (f239068w) {
            Log.d(f239059v, "Setting thumbnail attributes with offset: " + iP + ", length: " + iP2);
        }
    }

    public final void L(C0888b c0888b, HashMap map) throws IOException {
        d dVar = (d) map.get(f238748K);
        d dVar2 = (d) map.get(f238766M);
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] jArrD = t1.c.d(dVar.r(this.f239111h));
        long[] jArrD2 = t1.c.d(dVar2.r(this.f239111h));
        if (jArrD == null || jArrD.length == 0) {
            Log.w(f239059v, "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrD2 == null || jArrD2.length == 0) {
            Log.w(f239059v, "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrD.length != jArrD2.length) {
            Log.w(f239059v, "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j10 = 0;
        for (long j11 : jArrD2) {
            j10 += j11;
        }
        int i10 = (int) j10;
        byte[] bArr = new byte[i10];
        this.f239114k = true;
        this.f239113j = true;
        this.f239112i = true;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < jArrD.length; i13++) {
            int i14 = (int) jArrD[i13];
            int i15 = (int) jArrD2[i13];
            if (i13 < jArrD.length - 1 && i14 + i15 != jArrD[i13 + 1]) {
                this.f239114k = false;
            }
            int i16 = i14 - i11;
            if (i16 < 0) {
                Log.d(f239059v, "Invalid strip offset value");
                return;
            }
            long j12 = i16;
            if (c0888b.skip(j12) != j12) {
                Log.d(f239059v, "Failed to skip " + i16 + " bytes.");
                return;
            }
            int i17 = i11 + i16;
            byte[] bArr2 = new byte[i15];
            if (c0888b.read(bArr2) != i15) {
                Log.d(f239059v, "Failed to read " + i15 + " bytes.");
                return;
            }
            i11 = i17 + i15;
            System.arraycopy(bArr2, 0, bArr, i12, i15);
            i12 += i15;
        }
        this.f239117n = bArr;
        if (this.f239114k) {
            this.f239115l = (int) jArrD[0];
            this.f239116m = i10;
        }
    }

    public boolean M(@NonNull String str) {
        return q(str) != null;
    }

    public boolean N() {
        return this.f239112i;
    }

    public final void O(String str) throws Throwable {
        FileInputStream fileInputStream;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f239106c = null;
        this.f239104a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (X(fileInputStream.getFD())) {
                this.f239105b = fileInputStream.getFD();
            } else {
                this.f239105b = null;
            }
            e0(fileInputStream);
            t1.c.c(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            t1.c.c(fileInputStream2);
            throw th;
        }
    }

    public boolean Q() {
        int iL = l(f238676C, 1);
        return iL == 2 || iL == 7 || iL == 4 || iL == 5;
    }

    public final boolean R(byte[] bArr) throws Throwable {
        C0888b c0888b;
        long j10;
        C0888b c0888b2 = null;
        try {
            try {
                c0888b = new C0888b(bArr);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            long length = c0888b.readInt();
            byte[] bArr2 = new byte[4];
            c0888b.read(bArr2);
            if (!Arrays.equals(bArr2, f238718G5)) {
                c0888b.close();
                return false;
            }
            if (length == 1) {
                length = c0888b.readLong();
                j10 = 16;
                if (length < 16) {
                    c0888b.close();
                    return false;
                }
            } else {
                j10 = 8;
            }
            if (length > bArr.length) {
                length = bArr.length;
            }
            long j11 = length - j10;
            if (j11 < 8) {
                c0888b.close();
                return false;
            }
            byte[] bArr3 = new byte[4];
            boolean z10 = false;
            boolean z11 = false;
            for (long j12 = 0; j12 < j11 / 4; j12++) {
                if (c0888b.read(bArr3) != 4) {
                    c0888b.close();
                    return false;
                }
                if (j12 != 1) {
                    if (Arrays.equals(bArr3, f238727H5)) {
                        z10 = true;
                    } else if (Arrays.equals(bArr3, f238736I5)) {
                        z11 = true;
                    }
                    if (z10 && z11) {
                        c0888b.close();
                        return true;
                    }
                }
            }
            c0888b.close();
        } catch (Exception e11) {
            e = e11;
            c0888b2 = c0888b;
            if (f239068w) {
                Log.d(f239059v, "Exception parsing HEIF file type box.", e);
            }
            if (c0888b2 != null) {
                c0888b2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            c0888b2 = c0888b;
            if (c0888b2 != null) {
                c0888b2.close();
            }
            throw th;
        }
        return false;
    }

    public final boolean T(byte[] bArr) throws Throwable {
        C0888b c0888b = null;
        try {
            C0888b c0888b2 = new C0888b(bArr);
            try {
                ByteOrder byteOrderI0 = i0(c0888b2);
                this.f239111h = byteOrderI0;
                c0888b2.f239131b = byteOrderI0;
                short s10 = c0888b2.readShort();
                boolean z10 = s10 == 20306 || s10 == 21330;
                c0888b2.close();
                return z10;
            } catch (Exception unused) {
                c0888b = c0888b2;
                if (c0888b != null) {
                    c0888b.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                c0888b = c0888b2;
                if (c0888b != null) {
                    c0888b.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean U(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f238826S5;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    public final boolean V(byte[] bArr) throws IOException {
        byte[] bytes = f238700E5.getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    public final boolean W(byte[] bArr) throws Throwable {
        C0888b c0888b = null;
        try {
            C0888b c0888b2 = new C0888b(bArr);
            try {
                ByteOrder byteOrderI0 = i0(c0888b2);
                this.f239111h = byteOrderI0;
                c0888b2.f239131b = byteOrderI0;
                boolean z10 = c0888b2.readShort() == 85;
                c0888b2.close();
                return z10;
            } catch (Exception unused) {
                c0888b = c0888b2;
                if (c0888b != null) {
                    c0888b.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                c0888b = c0888b2;
                if (c0888b != null) {
                    c0888b.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean Y(HashMap map) throws IOException {
        d dVar;
        int iP;
        d dVar2 = (d) map.get(f239095z);
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.r(this.f239111h);
            int[] iArr2 = f239032r5;
            if (Arrays.equals(iArr2, iArr) || (this.f239107d == 3 && (dVar = (d) map.get(f238667B)) != null && (((iP = dVar.p(this.f239111h)) == 1 && Arrays.equals(iArr, f239048t5)) || (iP == 6 && Arrays.equals(iArr, iArr2))))) {
                return true;
            }
        }
        if (!f239068w) {
            return false;
        }
        Log.d(f239059v, "Unsupported data type value");
        return false;
    }

    public final void a() {
        String strI = i(f238987m0);
        if (strI != null && i(f238838U) == null) {
            this.f239109f[0].put(f238838U, d.h(strI));
        }
        if (i(f239077x) == null) {
            this.f239109f[0].put(f239077x, d.i(0L, this.f239111h));
        }
        if (i(f239086y) == null) {
            this.f239109f[0].put(f239086y, d.i(0L, this.f239111h));
        }
        if (i(f238676C) == null) {
            this.f239109f[0].put(f238676C, d.i(0L, this.f239111h));
        }
        if (i(f238785O0) == null) {
            this.f239109f[1].put(f238785O0, d.i(0L, this.f239111h));
        }
    }

    public final String b(double d10) {
        long j10 = (long) d10;
        double d11 = d10 - j10;
        long j11 = (long) (d11 * 60.0d);
        return j10 + "/1," + j11 + "/1," + Math.round((d11 - (j11 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    public final boolean b0(HashMap map) throws IOException {
        d dVar = (d) map.get(f239086y);
        d dVar2 = (d) map.get(f239077x);
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.p(this.f239111h) <= 512 && dVar2.p(this.f239111h) <= 512;
    }

    public boolean c0() {
        if (!this.f239112i) {
            return false;
        }
        int i10 = this.f239118o;
        return i10 == 6 || i10 == 7;
    }

    public final void d(C0888b c0888b, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            if (c0888b.read(bArr3) != 4) {
                StringBuilder sb2 = new StringBuilder("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f238970j7;
                sb2.append(new String(bArr, charset));
                sb2.append(bArr2 == null ? "" : " or ".concat(new String(bArr2, charset)));
                throw new IOException(sb2.toString());
            }
            e(c0888b, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public final boolean d0(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f238880Y5;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = f238889Z5;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f238880Y5.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
    }

    public final void e(C0888b c0888b, c cVar, byte[] bArr) throws IOException {
        int i10 = c0888b.readInt();
        cVar.write(bArr);
        cVar.c(i10);
        if (i10 % 2 == 1) {
            i10++;
        }
        t1.c.f(c0888b, cVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x009f A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0004, B:6:0x0009, B:13:0x001e, B:15:0x0022, B:16:0x0030, B:18:0x0038, B:20:0x0041, B:31:0x0061, B:21:0x0045, B:23:0x004b, B:26:0x0052, B:29:0x005a, B:30:0x005e, B:32:0x006b, B:34:0x0075, B:37:0x007d, B:40:0x0085, B:43:0x008d, B:48:0x009b, B:50:0x009f), top: B:61:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e0(@androidx.annotation.NonNull java.io.InputStream r5) {
        /*
            r4 = this;
            if (r5 == 0) goto Lba
            r0 = 0
            r1 = r0
        L4:
            t1.b$f[][] r2 = t1.b.f238922d7     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r2.length     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 >= r2) goto L1e
            java.util.HashMap<java.lang.String, t1.b$d>[] r2 = r4.f239109f     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3.<init>()     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2[r1] = r3     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r1 = r1 + 1
            goto L4
        L15:
            r5 = move-exception
            goto Laf
        L18:
            r5 = move-exception
            goto L9b
        L1b:
            r5 = move-exception
            goto L9b
        L1e:
            boolean r1 = r4.f239108e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 != 0) goto L30
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.w(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.f239107d = r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r5 = r1
        L30:
            int r1 = r4.f239107d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r1 = A0(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 == 0) goto L6b
            t1.b$i r0 = new t1.b$i     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r5 = r4.f239108e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r5 == 0) goto L45
            r4.D(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L45:
            int r5 = r4.f239107d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1 = 12
            if (r5 != r1) goto L4f
            r4.s(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L4f:
            r1 = 7
            if (r5 != r1) goto L56
            r4.x(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L56:
            r1 = 10
            if (r5 != r1) goto L5e
            r4.C(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L5e:
            r4.A(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L61:
            int r5 = r4.f239119p     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            long r1 = (long) r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.n(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.z0(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L6b:
            t1.b$b r1 = new t1.b$b     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.f239107d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 4
            if (r5 != r2) goto L79
            r4.t(r1, r0, r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L79:
            r0 = 13
            if (r5 != r0) goto L81
            r4.y(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L81:
            r0 = 9
            if (r5 != r0) goto L89
            r4.z(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L89:
            r0 = 14
            if (r5 != r0) goto L90
            r4.I(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L90:
            r4.a()
            boolean r5 = t1.b.f239068w
            if (r5 == 0) goto Lae
            r4.h0()
            return
        L9b:
            boolean r0 = t1.b.f239068w     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto La6
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r5)     // Catch: java.lang.Throwable -> L15
        La6:
            r4.a()
            if (r0 == 0) goto Lae
            r4.h0()
        Lae:
            return
        Laf:
            r4.a()
            boolean r0 = t1.b.f239068w
            if (r0 == 0) goto Lb9
            r4.h0()
        Lb9:
            throw r5
        Lba:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.b.e0(java.io.InputStream):void");
    }

    public void f() {
        int i10 = 1;
        switch (l(f238676C, 1)) {
            case 1:
                i10 = 2;
                break;
            case 2:
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 3;
                break;
            case 5:
                i10 = 6;
                break;
            case 6:
                i10 = 5;
                break;
            case 7:
                i10 = 8;
                break;
            case 8:
                i10 = 7;
                break;
            default:
                i10 = 0;
                break;
        }
        v0(f238676C, Integer.toString(i10));
    }

    public void g() {
        int i10 = 1;
        switch (l(f238676C, 1)) {
            case 1:
                i10 = 4;
                break;
            case 2:
                i10 = 3;
                break;
            case 3:
                i10 = 2;
                break;
            case 4:
                break;
            case 5:
                i10 = 8;
                break;
            case 6:
                i10 = 7;
                break;
            case 7:
                i10 = 6;
                break;
            case 8:
                i10 = 5;
                break;
            default:
                i10 = 0;
                break;
        }
        v0(f238676C, Integer.toString(i10));
    }

    public final void g0(C0888b c0888b) throws IOException {
        ByteOrder byteOrderI0 = i0(c0888b);
        this.f239111h = byteOrderI0;
        c0888b.l(byteOrderI0);
        int unsignedShort = c0888b.readUnsignedShort();
        int i10 = this.f239107d;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException(C5377a.a(unsignedShort, new StringBuilder("Invalid start code: ")));
        }
        int i11 = c0888b.readInt();
        if (i11 < 8) {
            throw new IOException(android.support.v4.media.c.a("Invalid first Ifd offset: ", i11));
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            c0888b.m(i12);
        }
    }

    public double h(double d10) {
        double dK = k(f238687D1, -1.0d);
        int iL = l(f238678C1, -1);
        if (dK < 0.0d || iL < 0) {
            return d10;
        }
        return dK * ((double) (iL != 1 ? 1 : -1));
    }

    public final void h0() {
        for (int i10 = 0; i10 < this.f239109f.length; i10++) {
            StringBuilder sbA = android.support.v4.media.a.a("The size of tag group[", i10, "]: ");
            sbA.append(this.f239109f[i10].size());
            Log.d(f239059v, sbA.toString());
            for (Map.Entry<String, d> entry : this.f239109f[i10].entrySet()) {
                d value = entry.getValue();
                Log.d(f239059v, "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.q(this.f239111h) + "'");
            }
        }
    }

    @Nullable
    public String i(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarQ = q(str);
        if (dVarQ != null) {
            if (!f238954h7.contains(str)) {
                return dVarQ.q(this.f239111h);
            }
            if (str.equals(f238696E1)) {
                int i10 = dVarQ.f239137a;
                if (i10 != 5 && i10 != 10) {
                    Log.w(f239059v, "GPS Timestamp format is not rational. format=" + dVarQ.f239137a);
                    return null;
                }
                h[] hVarArr = (h[]) dVarQ.r(this.f239111h);
                if (hVarArr == null || hVarArr.length != 3) {
                    Log.w(f239059v, "Invalid GPS Timestamp array. array=" + Arrays.toString(hVarArr));
                    return null;
                }
                h hVar = hVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (hVar.f239145a / hVar.f239146b));
                h hVar2 = hVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (hVar2.f239145a / hVar2.f239146b));
                h hVar3 = hVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (hVar3.f239145a / hVar3.f239146b)));
            }
            try {
                return Double.toString(dVarQ.o(this.f239111h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final ByteOrder i0(C0888b c0888b) throws IOException {
        short s10 = c0888b.readShort();
        if (s10 == 18761) {
            if (f239068w) {
                Log.d(f239059v, "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 != 19789) {
            throw new IOException(C5377a.a(s10, new StringBuilder("Invalid byte order: ")));
        }
        if (f239068w) {
            Log.d(f239059v, "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    @Nullable
    public byte[] j(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarQ = q(str);
        if (dVarQ != null) {
            return dVarQ.f239140d;
        }
        return null;
    }

    public final void j0(byte[] bArr, int i10) throws IOException {
        i iVar = new i(bArr);
        g0(iVar);
        k0(iVar, i10);
    }

    public double k(@NonNull String str, double d10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarQ = q(str);
        if (dVarQ != null) {
            try {
                return dVarQ.o(this.f239111h);
            } catch (NumberFormatException unused) {
            }
        }
        return d10;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k0(t1.b.i r30, int r31) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.b.k0(t1.b$i, int):void");
    }

    public int l(@NonNull String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarQ = q(str);
        if (dVarQ != null) {
            try {
                return dVarQ.p(this.f239111h);
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public final void l0(String str) {
        for (int i10 = 0; i10 < f238922d7.length; i10++) {
            this.f239109f[i10].remove(str);
        }
    }

    @Nullable
    public long[] m(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (this.f239123t) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        d dVarQ = q(str);
        if (dVarQ != null) {
            return new long[]{dVarQ.f239139c, dVarQ.f239140d.length};
        }
        return null;
    }

    public final void m0(int i10, String str, String str2) {
        if (this.f239109f[i10].isEmpty() || this.f239109f[i10].get(str) == null) {
            return;
        }
        HashMap<String, d> map = this.f239109f[i10];
        map.put(str2, map.get(str));
        this.f239109f[i10].remove(str);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Long n() {
        return f0(i(f238838U), i(f239027r0), i(f239003o0));
    }

    public void n0() {
        v0(f238676C, Integer.toString(1));
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Long o() {
        return f0(i(f238995n0), i(f239043t0), i(f239019q0));
    }

    public final void o0(i iVar, int i10) throws Throwable {
        d dVar = this.f239109f[i10].get(f239086y);
        d dVar2 = this.f239109f[i10].get(f239077x);
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f239109f[i10].get(f238775N);
            d dVar4 = this.f239109f[i10].get(f238784O);
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int iP = dVar3.p(this.f239111h);
            int iP2 = dVar3.p(this.f239111h);
            iVar.n(iP);
            byte[] bArr = new byte[iP2];
            iVar.read(bArr);
            t(new C0888b(bArr), iP, i10);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Long p() {
        return f0(i(f238987m0), i(f239035s0), i(f239011p0));
    }

    public void p0(int i10) {
        if (i10 % 90 != 0) {
            throw new IllegalArgumentException("degree should be a multiple of 90");
        }
        int iL = l(f238676C, 1);
        List<Integer> list = f238769M2;
        if (list.contains(Integer.valueOf(iL))) {
            int iIndexOf = ((i10 / 90) + list.indexOf(Integer.valueOf(iL))) % 4;
            iIntValue = list.get(iIndexOf + (iIndexOf < 0 ? 4 : 0)).intValue();
        } else {
            List<Integer> list2 = f238778N2;
            if (list2.contains(Integer.valueOf(iL))) {
                int iIndexOf2 = ((i10 / 90) + list2.indexOf(Integer.valueOf(iL))) % 4;
                iIntValue = list2.get(iIndexOf2 + (iIndexOf2 < 0 ? 4 : 0)).intValue();
            }
        }
        v0(f238676C, Integer.toString(iIntValue));
    }

    @Nullable
    public final d q(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (f239087y0.equals(str)) {
            if (f239068w) {
                Log.d(f239059v, "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = f239096z0;
        }
        for (int i10 = 0; i10 < f238922d7.length; i10++) {
            d dVar = this.f239109f[i10].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00f3 A[Catch: all -> 0x0103, Exception -> 0x0107, TryCatch #20 {Exception -> 0x0107, all -> 0x0103, blocks: (B:68:0x00ef, B:70:0x00f3, B:78:0x0111, B:77:0x0109), top: B:127:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0109 A[Catch: all -> 0x0103, Exception -> 0x0107, TryCatch #20 {Exception -> 0x0107, all -> 0x0103, blocks: (B:68:0x00ef, B:70:0x00f3, B:78:0x0111, B:77:0x0109), top: B:127:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q0() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.b.q0():void");
    }

    @Nullable
    @SuppressLint({"AutoBoxing"})
    public Long r() {
        String strI = i(f238893a2);
        String strI2 = i(f238696E1);
        if (strI == null || strI2 == null) {
            return null;
        }
        Pattern pattern = f238846U7;
        if (!pattern.matcher(strI).matches() && !pattern.matcher(strI2).matches()) {
            return null;
        }
        String str = strI + ' ' + strI2;
        ParsePosition parsePosition = new ParsePosition(0);
        try {
            Date date = f238993m6.parse(str, parsePosition);
            if (date == null && (date = f239001n6.parse(str, parsePosition)) == null) {
                return null;
            }
            return Long.valueOf(date.getTime());
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final void r0(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (f239068w) {
            Log.d(f239059v, "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        C0888b c0888b = new C0888b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (c0888b.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-1);
        if (c0888b.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-40);
        d dVarRemove = (i(f239045t2) == null || !this.f239124u) ? null : this.f239109f[0].remove(f239045t2);
        cVar.b(-1);
        cVar.b(-31);
        E0(cVar);
        if (dVarRemove != null) {
            this.f239109f[0].put(f239045t2, dVarRemove);
        }
        byte[] bArr = new byte[4096];
        while (c0888b.readByte() == -1) {
            byte b10 = c0888b.readByte();
            if (b10 == -39 || b10 == -38) {
                cVar.b(-1);
                cVar.b(b10);
                t1.c.e(c0888b, cVar);
                return;
            }
            if (b10 != -31) {
                cVar.b(-1);
                cVar.b(b10);
                int unsignedShort = c0888b.readUnsignedShort();
                cVar.d((short) unsignedShort);
                int i10 = unsignedShort - 2;
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i10 > 0) {
                    int i11 = c0888b.read(bArr, 0, Math.min(i10, 4096));
                    if (i11 >= 0) {
                        cVar.write(bArr, 0, i11);
                        i10 -= i11;
                    }
                }
            } else {
                int unsignedShort2 = c0888b.readUnsignedShort();
                int i12 = unsignedShort2 - 2;
                if (i12 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i12 >= 6) {
                    if (c0888b.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, f238978k7)) {
                        c0888b.m(unsignedShort2 - 8);
                    }
                }
                cVar.b(-1);
                cVar.b(b10);
                cVar.d((short) unsignedShort2);
                if (i12 >= 6) {
                    i12 = unsignedShort2 - 8;
                    cVar.write(bArr2);
                }
                while (i12 > 0) {
                    int i13 = c0888b.read(bArr, 0, Math.min(i12, 4096));
                    if (i13 >= 0) {
                        cVar.write(bArr, 0, i13);
                        i12 -= i13;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    public final void s(i iVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                c.b.a(mediaMetadataRetriever, new a(iVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f239109f[0].put(f239077x, d.m(Integer.parseInt(strExtractMetadata), this.f239111h));
                }
                if (strExtractMetadata2 != null) {
                    this.f239109f[0].put(f239086y, d.m(Integer.parseInt(strExtractMetadata2), this.f239111h));
                }
                if (strExtractMetadata3 != null) {
                    int i10 = Integer.parseInt(strExtractMetadata3);
                    this.f239109f[0].put(f238676C, d.m(i10 != 90 ? i10 != 180 ? i10 != 270 ? 1 : 8 : 3 : 6, this.f239111h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata4);
                    int i12 = Integer.parseInt(strExtractMetadata5);
                    if (i12 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    iVar.n(i11);
                    byte[] bArr = new byte[6];
                    if (iVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i13 = i11 + 6;
                    int i14 = i12 - 6;
                    if (!Arrays.equals(bArr, f238978k7)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i14];
                    if (iVar.read(bArr2) != i14) {
                        throw new IOException("Can't read exif");
                    }
                    this.f239119p = i13;
                    j0(bArr2, 0);
                }
                if (f239068w) {
                    Log.d(f239059v, "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    public final void s0(InputStream inputStream, OutputStream outputStream) throws Throwable {
        if (f239068w) {
            Log.d(f239059v, "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        C0888b c0888b = new C0888b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        t1.c.f(c0888b, cVar, f238826S5.length);
        if (this.f239119p == 0) {
            int i10 = c0888b.readInt();
            cVar.c(i10);
            t1.c.f(c0888b, cVar, i10 + 8);
        } else {
            t1.c.f(c0888b, cVar, (r2 - r7.length) - 8);
            c0888b.m(c0888b.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                E0(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f239134a).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.c((int) crc32.getValue());
                t1.c.c(byteArrayOutputStream2);
                t1.c.e(c0888b, cVar);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                t1.c.c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[FALL_THROUGH] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1091)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(t1.b.C0888b r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.b.t(t1.b$b, int, int):void");
    }

    public final void t0(InputStream inputStream, OutputStream outputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        char c10;
        int i10;
        int i11;
        int i12;
        if (f239068w) {
            Log.d(f239059v, "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        C0888b c0888b = new C0888b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = f238880Y5;
        t1.c.f(c0888b, cVar, bArr.length);
        byte[] bArr2 = f238889Z5;
        c0888b.m(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            int i13 = this.f239119p;
            if (i13 != 0) {
                t1.c.f(c0888b, cVar2, (i13 - ((bArr.length + 4) + bArr2.length)) - 8);
                c0888b.m(4);
                int i14 = c0888b.readInt();
                if (i14 % 2 != 0) {
                    i14++;
                }
                c0888b.m(i14);
                E0(cVar2);
            } else {
                byte[] bArr3 = new byte[4];
                if (c0888b.read(bArr3) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunk type");
                }
                byte[] bArr4 = f238929e6;
                boolean z10 = true;
                if (Arrays.equals(bArr3, bArr4)) {
                    int i15 = c0888b.readInt();
                    byte[] bArr5 = new byte[i15 % 2 == 1 ? i15 + 1 : i15];
                    c0888b.read(bArr5);
                    byte b10 = (byte) (8 | bArr5[0]);
                    bArr5[0] = b10;
                    boolean z11 = ((b10 >> 1) & 1) == 1;
                    cVar2.write(bArr4);
                    cVar2.c(i15);
                    cVar2.write(bArr5);
                    if (z11) {
                        d(c0888b, cVar2, f238953h6, null);
                        while (true) {
                            byte[] bArr6 = new byte[4];
                            inputStream.read(bArr6);
                            if (!Arrays.equals(bArr6, f238961i6)) {
                                break;
                            } else {
                                e(c0888b, cVar2, bArr6);
                            }
                        }
                        E0(cVar2);
                    } else {
                        d(c0888b, cVar2, f238945g6, f238937f6);
                        E0(cVar2);
                    }
                } else {
                    byte[] bArr7 = f238945g6;
                    if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, f238937f6)) {
                        int i16 = c0888b.readInt();
                        int i17 = i16 % 2 == 1 ? i16 + 1 : i16;
                        byte[] bArr8 = new byte[3];
                        if (Arrays.equals(bArr3, bArr7)) {
                            c0888b.read(bArr8);
                            byte[] bArr9 = new byte[3];
                            c10 = '\b';
                            if (c0888b.read(bArr9) != 3 || !Arrays.equals(f238913c6, bArr9)) {
                                throw new IOException("Encountered error while checking VP8 signature");
                            }
                            i10 = c0888b.readInt();
                            i17 -= 10;
                            i12 = (i10 << 2) >> 18;
                            i11 = (i10 << 18) >> 18;
                            z10 = false;
                        } else {
                            c10 = '\b';
                            if (!Arrays.equals(bArr3, f238937f6)) {
                                i10 = 0;
                                z10 = false;
                                i11 = 0;
                                i12 = 0;
                            } else {
                                if (c0888b.readByte() != 47) {
                                    throw new IOException("Encountered error while checking VP8L signature");
                                }
                                i10 = c0888b.readInt();
                                i11 = (i10 & 16383) + 1;
                                i12 = ((i10 & 268419072) >>> 14) + 1;
                                if ((i10 & 268435456) == 0) {
                                    z10 = false;
                                }
                                i17 -= 5;
                            }
                        }
                        cVar2.write(bArr4);
                        cVar2.c(10);
                        byte[] bArr10 = new byte[10];
                        if (z10) {
                            bArr10[0] = (byte) (bArr10[0] | 16);
                        }
                        bArr10[0] = (byte) (bArr10[0] | 8);
                        int i18 = i11 - 1;
                        int i19 = i12 - 1;
                        bArr10[4] = (byte) i18;
                        bArr10[5] = (byte) (i18 >> 8);
                        bArr10[6] = (byte) (i18 >> 16);
                        bArr10[7] = (byte) i19;
                        bArr10[c10] = (byte) (i19 >> 8);
                        bArr10[9] = (byte) (i19 >> 16);
                        cVar2.write(bArr10);
                        cVar2.write(bArr3);
                        cVar2.c(i16);
                        if (Arrays.equals(bArr3, bArr7)) {
                            cVar2.write(bArr8);
                            cVar2.write(f238913c6);
                            cVar2.c(i10);
                        } else if (Arrays.equals(bArr3, f238937f6)) {
                            cVar2.write(47);
                            cVar2.c(i10);
                        }
                        t1.c.f(c0888b, cVar2, i17);
                        E0(cVar2);
                    }
                }
            }
            t1.c.e(c0888b, cVar2);
            int size = byteArrayOutputStream.size();
            byte[] bArr11 = f238889Z5;
            cVar.c(size + bArr11.length);
            cVar.write(bArr11);
            byteArrayOutputStream.writeTo(cVar);
            t1.c.c(byteArrayOutputStream);
        } catch (Exception e11) {
            e = e11;
            byteArrayOutputStream2 = byteArrayOutputStream;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            t1.c.c(byteArrayOutputStream2);
            throw th;
        }
    }

    @Deprecated
    public boolean u(float[] fArr) {
        double[] dArrV = v();
        if (dArrV == null) {
            return false;
        }
        fArr[0] = (float) dArrV[0];
        fArr[1] = (float) dArrV[1];
        return true;
    }

    public void u0(double d10) {
        String str = d10 >= 0.0d ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1";
        v0(f238687D1, new h(Math.abs(d10)).toString());
        v0(f238678C1, str);
    }

    @Nullable
    public double[] v() {
        String strI = i(f239097z1);
        String strI2 = i(f239088y1);
        String strI3 = i(f238669B1);
        String strI4 = i(f238660A1);
        if (strI == null || strI2 == null || strI3 == null || strI4 == null) {
            return null;
        }
        try {
            return new double[]{c(strI, strI2), c(strI3, strI4)};
        } catch (IllegalArgumentException unused) {
            Log.w(f239059v, "Latitude/longitude values are not parsable. ".concat(String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", strI, strI2, strI3, strI4)));
            return null;
        }
    }

    public void v0(@NonNull String str, @Nullable String str2) {
        f fVar;
        int i10;
        int i11;
        int i12;
        String str3;
        int i13;
        String str4 = str;
        String strReplaceAll = str2;
        if (str4 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        boolean zEquals = f238838U.equals(str4);
        String str5 = f239059v;
        if ((zEquals || f238987m0.equals(str4) || f238995n0.equals(str4)) && strReplaceAll != null) {
            boolean zFind = f238864W7.matcher(strReplaceAll).find();
            boolean zFind2 = f238873X7.matcher(strReplaceAll).find();
            if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                Log.w(f239059v, "Invalid value for " + str4 + " : " + strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll(com.prism.gaia.download.a.f164606q, com.prism.gaia.server.accounts.b.f166434b0);
            }
        }
        if (f239087y0.equals(str4)) {
            if (f239068w) {
                Log.d(f239059v, "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str4 = f239096z0;
        }
        int i14 = 2;
        int i15 = 1;
        if (strReplaceAll != null && f238954h7.contains(str4)) {
            if (str4.equals(f238696E1)) {
                Matcher matcher = f238855V7.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w(f239059v, "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    strReplaceAll = new h(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    Log.w(f239059v, "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
            }
        }
        int i16 = 0;
        int i17 = 0;
        while (i17 < f238922d7.length) {
            if ((i17 != 4 || this.f239112i) && (fVar = f238946g7[i17].get(str4)) != null) {
                if (strReplaceAll != null) {
                    Pair<Integer, Integer> pairJ = J(strReplaceAll);
                    if (fVar.f239143c == ((Integer) pairJ.first).intValue() || fVar.f239143c == ((Integer) pairJ.second).intValue()) {
                        i10 = fVar.f239143c;
                    } else {
                        int i18 = fVar.f239144d;
                        if (i18 == -1 || !(i18 == ((Integer) pairJ.first).intValue() || fVar.f239144d == ((Integer) pairJ.second).intValue())) {
                            int i19 = fVar.f239143c;
                            if (i19 == i15 || i19 == 7 || i19 == i14) {
                                i10 = i19;
                            } else if (f239068w) {
                                StringBuilder sbA = androidx.activity.result.i.a("Given tag (", str4, ") value didn't match with one of expected formats: ");
                                String[] strArr = f238719G6;
                                sbA.append(strArr[fVar.f239143c]);
                                sbA.append(fVar.f239144d == -1 ? "" : j.f68738d + strArr[fVar.f239144d]);
                                sbA.append(" (guess: ");
                                sbA.append(strArr[((Integer) pairJ.first).intValue()]);
                                sbA.append(((Integer) pairJ.second).intValue() != -1 ? j.f68738d + strArr[((Integer) pairJ.second).intValue()] : "");
                                sbA.append(")");
                                Log.d(str5, sbA.toString());
                            }
                        } else {
                            i10 = fVar.f239144d;
                        }
                    }
                    switch (i10) {
                        case 1:
                            i11 = i16;
                            i12 = i17;
                            str3 = str5;
                            i13 = i15;
                            this.f239109f[i12].put(str4, d.a(strReplaceAll));
                            break;
                        case 2:
                        case 7:
                            i11 = i16;
                            i12 = i17;
                            str3 = str5;
                            i13 = i15;
                            this.f239109f[i12].put(str4, d.h(strReplaceAll));
                            break;
                        case 3:
                            i11 = i16;
                            i12 = i17;
                            str3 = str5;
                            i13 = i15;
                            String[] strArrSplit = strReplaceAll.split(",", -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i20 = i11; i20 < strArrSplit.length; i20++) {
                                iArr[i20] = Integer.parseInt(strArrSplit[i20]);
                            }
                            this.f239109f[i12].put(str4, d.n(iArr, this.f239111h));
                            break;
                        case 4:
                            i11 = i16;
                            i12 = i17;
                            str3 = str5;
                            i13 = i15;
                            String[] strArrSplit2 = strReplaceAll.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i21 = i11; i21 < strArrSplit2.length; i21++) {
                                jArr[i21] = Long.parseLong(strArrSplit2[i21]);
                            }
                            this.f239109f[i12].put(str4, d.j(jArr, this.f239111h));
                            break;
                        case 5:
                            i11 = i16;
                            i13 = i15;
                            String[] strArrSplit3 = strReplaceAll.split(",", -1);
                            h[] hVarArr = new h[strArrSplit3.length];
                            int i22 = i11;
                            while (i22 < strArrSplit3.length) {
                                String[] strArrSplit4 = strArrSplit3[i22].split(RemoteSettings.FORWARD_SLASH_STRING, -1);
                                hVarArr[i22] = new h((long) Double.parseDouble(strArrSplit4[i11]), (long) Double.parseDouble(strArrSplit4[i13]));
                                i22++;
                                str5 = str5;
                                i17 = i17;
                            }
                            i12 = i17;
                            str3 = str5;
                            this.f239109f[i12].put(str4, d.l(hVarArr, this.f239111h));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (f239068w) {
                                C5596a.a("Data format isn't one of expected formats: ", i10, str5);
                            }
                            break;
                        case 9:
                            i11 = i16;
                            i13 = i15;
                            String[] strArrSplit5 = strReplaceAll.split(",", -1);
                            int[] iArr2 = new int[strArrSplit5.length];
                            for (int i23 = i11; i23 < strArrSplit5.length; i23++) {
                                iArr2[i23] = Integer.parseInt(strArrSplit5[i23]);
                            }
                            this.f239109f[i17].put(str4, d.e(iArr2, this.f239111h));
                            i12 = i17;
                            str3 = str5;
                            break;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(",", -1);
                            h[] hVarArr2 = new h[strArrSplit6.length];
                            int i24 = i16;
                            while (i24 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i24].split(RemoteSettings.FORWARD_SLASH_STRING, -1);
                                hVarArr2[i24] = new h((long) Double.parseDouble(strArrSplit7[i16]), (long) Double.parseDouble(strArrSplit7[i15]));
                                i24++;
                                i16 = i16;
                                i15 = i15;
                                strArrSplit6 = strArrSplit6;
                            }
                            i11 = i16;
                            i13 = i15;
                            this.f239109f[i17].put(str4, d.g(hVarArr2, this.f239111h));
                            i12 = i17;
                            str3 = str5;
                            break;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(",", -1);
                            double[] dArr = new double[strArrSplit8.length];
                            for (int i25 = i16; i25 < strArrSplit8.length; i25++) {
                                dArr[i25] = Double.parseDouble(strArrSplit8[i25]);
                            }
                            this.f239109f[i17].put(str4, d.c(dArr, this.f239111h));
                            break;
                    }
                } else {
                    this.f239109f[i17].remove(str4);
                }
                i11 = i16;
                i12 = i17;
                str3 = str5;
                i13 = i15;
            } else {
                i11 = i16;
                i12 = i17;
                str3 = str5;
                i13 = i15;
            }
            i17 = i12 + 1;
            i16 = i11;
            str5 = str3;
            i15 = i13;
            i14 = 2;
        }
    }

    public final int w(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (S(bArr)) {
            return 4;
        }
        if (V(bArr)) {
            return 9;
        }
        if (R(bArr)) {
            return 12;
        }
        if (T(bArr)) {
            return 7;
        }
        if (W(bArr)) {
            return 10;
        }
        if (U(bArr)) {
            return 13;
        }
        return d0(bArr) ? 14 : 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void w0(@NonNull Long l10) {
        if (l10 == null) {
            throw new NullPointerException("Timestamp should not be null.");
        }
        if (l10.longValue() < 0) {
            throw new IllegalArgumentException("Timestamp should a positive value.");
        }
        String string = Long.toString(l10.longValue() % 1000);
        for (int length = string.length(); length < 3; length++) {
            string = y.a(MBridgeConstans.ENDCARD_URL_TYPE_PL, string);
        }
        v0(f238838U, f238993m6.format(new Date(l10.longValue())));
        v0(f239027r0, string);
    }

    public final void x(i iVar) throws Throwable {
        int i10;
        int i11;
        A(iVar);
        d dVar = this.f239109f[1].get(f238963j0);
        if (dVar != null) {
            i iVar2 = new i(dVar.f239140d);
            iVar2.f239131b = this.f239111h;
            byte[] bArr = f238763L5;
            byte[] bArr2 = new byte[bArr.length];
            iVar2.readFully(bArr2);
            iVar2.n(0L);
            byte[] bArr3 = f238772M5;
            byte[] bArr4 = new byte[bArr3.length];
            iVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                iVar2.n(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                iVar2.n(12L);
            }
            k0(iVar2, 6);
            d dVar2 = this.f239109f[7].get(f238973k2);
            d dVar3 = this.f239109f[7].get(f238981l2);
            if (dVar2 != null && dVar3 != null) {
                this.f239109f[5].put(f238775N, dVar2);
                this.f239109f[5].put(f238784O, dVar3);
            }
            d dVar4 = this.f239109f[8].get(f238989m2);
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.r(this.f239111h);
                if (iArr == null || iArr.length != 4) {
                    Log.w(f239059v, "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                d dVarM = d.m(i14, this.f239111h);
                d dVarM2 = d.m(i15, this.f239111h);
                this.f239109f[0].put(f239077x, dVarM);
                this.f239109f[0].put(f239086y, dVarM2);
            }
        }
    }

    public void x0(Location location) {
        if (location == null) {
            return;
        }
        v0(f238876Y1, location.getProvider());
        y0(location.getLatitude(), location.getLongitude());
        u0(location.getAltitude());
        v0(f238741J1, "K");
        v0(f238750K1, new h((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] strArrSplit = f238993m6.format(new Date(location.getTime())).split("\\s+", -1);
        v0(f238893a2, strArrSplit[0]);
        v0(f238696E1, strArrSplit[1]);
    }

    public final void y(C0888b c0888b) throws Throwable {
        if (f239068w) {
            Log.d(f239059v, "getPngAttributes starting with: " + c0888b);
        }
        c0888b.l(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f238826S5;
        c0888b.m(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i10 = c0888b.readInt();
                byte[] bArr2 = new byte[4];
                if (c0888b.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i11 = length + 8;
                if (i11 == 16 && !Arrays.equals(bArr2, f238844U5)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f238853V5)) {
                    return;
                }
                if (Arrays.equals(bArr2, f238835T5)) {
                    byte[] bArr3 = new byte[i10];
                    if (c0888b.read(bArr3) != i10) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + t1.c.a(bArr2));
                    }
                    int i12 = c0888b.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i12) {
                        this.f239119p = i11;
                        j0(bArr3, 0);
                        D0();
                        z0(new C0888b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i12 + ", calculated CRC value: " + crc32.getValue());
                }
                int i13 = i10 + 4;
                c0888b.m(i13);
                length = i11 + i13;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public void y0(double d10, double d11) {
        if (d10 < -90.0d || d10 > 90.0d || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Latitude value " + d10 + " is not valid.");
        }
        if (d11 < -180.0d || d11 > 180.0d || Double.isNaN(d11)) {
            throw new IllegalArgumentException("Longitude value " + d11 + " is not valid.");
        }
        v0(f239088y1, d10 >= 0.0d ? "N" : f238816R4);
        v0(f239097z1, b(Math.abs(d10)));
        v0(f238660A1, d11 >= 0.0d ? f238825S4 : f238834T4);
        v0(f238669B1, b(Math.abs(d11)));
    }

    public final void z(C0888b c0888b) throws Throwable {
        boolean z10 = f239068w;
        if (z10) {
            Log.d(f239059v, "getRafAttributes starting with: " + c0888b);
        }
        c0888b.m(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c0888b.read(bArr);
        c0888b.read(bArr2);
        c0888b.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        c0888b.m(i10 - c0888b.d());
        c0888b.read(bArr4);
        t(new C0888b(bArr4), i10, 5);
        c0888b.m(i12 - c0888b.d());
        c0888b.l(ByteOrder.BIG_ENDIAN);
        int i13 = c0888b.readInt();
        if (z10) {
            C5596a.a("numberOfDirectoryEntry: ", i13, f239059v);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = c0888b.readUnsignedShort();
            int unsignedShort2 = c0888b.readUnsignedShort();
            if (unsignedShort == f238791O6.f239141a) {
                short s10 = c0888b.readShort();
                short s11 = c0888b.readShort();
                d dVarM = d.m(s10, this.f239111h);
                d dVarM2 = d.m(s11, this.f239111h);
                this.f239109f[0].put(f239086y, dVarM);
                this.f239109f[0].put(f239077x, dVarM2);
                if (f239068w) {
                    Log.d(f239059v, "Updated to length: " + ((int) s10) + ", width: " + ((int) s11));
                    return;
                }
                return;
            }
            c0888b.m(unsignedShort2);
        }
    }

    public final void z0(C0888b c0888b) throws Throwable {
        HashMap<String, d> map = this.f239109f[4];
        d dVar = map.get(f238658A);
        if (dVar == null) {
            this.f239118o = 6;
            K(c0888b, map);
            return;
        }
        int iP = dVar.p(this.f239111h);
        this.f239118o = iP;
        if (iP != 1) {
            if (iP == 6) {
                K(c0888b, map);
                return;
            } else if (iP != 7) {
                return;
            }
        }
        if (Y(map)) {
            L(c0888b, map);
        }
    }

    public static class i extends C0888b {
        public i(byte[] bArr) throws IOException {
            super(bArr);
            this.f239130a.mark(Integer.MAX_VALUE);
        }

        public void n(long j10) throws IOException {
            int i10 = this.f239132c;
            if (i10 > j10) {
                this.f239132c = 0;
                this.f239130a.reset();
            } else {
                j10 -= (long) i10;
            }
            m((int) j10);
        }

        public i(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f239130a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f239141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f239142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f239143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f239144d;

        public f(String str, int i10, int i11) {
            this.f239142b = str;
            this.f239141a = i10;
            this.f239143c = i11;
            this.f239144d = -1;
        }

        public boolean a(int i10) {
            int i11;
            int i12 = this.f239143c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f239144d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }

        public f(String str, int i10, int i11, int i12) {
            this.f239142b = str;
            this.f239141a = i10;
            this.f239143c = i11;
            this.f239144d = i12;
        }
    }

    public b(@NonNull String str) throws Throwable {
        f[][] fVarArr = f238922d7;
        this.f239109f = new HashMap[fVarArr.length];
        this.f239110g = new HashSet(fVarArr.length);
        this.f239111h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            O(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public b(@NonNull FileDescriptor fileDescriptor) throws Throwable {
        boolean z10;
        FileInputStream fileInputStream;
        Throwable th;
        f[][] fVarArr = f238922d7;
        this.f239109f = new HashMap[fVarArr.length];
        this.f239110g = new HashSet(fVarArr.length);
        this.f239111h = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.f239106c = null;
            this.f239104a = null;
            if (X(fileDescriptor)) {
                this.f239105b = fileDescriptor;
                try {
                    fileDescriptor = c.a.b(fileDescriptor);
                    z10 = true;
                } catch (Exception e10) {
                    throw new IOException("Failed to duplicate file descriptor", e10);
                }
            } else {
                this.f239105b = null;
                z10 = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    e0(fileInputStream);
                    t1.c.c(fileInputStream);
                    if (z10) {
                        t1.c.b(fileDescriptor);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    t1.c.c(fileInputStream);
                    if (z10) {
                        t1.c.b(fileDescriptor);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                fileInputStream = null;
                th = th3;
            }
        } else {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
    }

    public class a extends MediaDataSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f239125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f239126b;

        public a(i iVar) {
            this.f239126b = iVar;
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) throws IOException {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f239125a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + ((long) this.f239126b.available())) {
                        return -1;
                    }
                    this.f239126b.n(j10);
                    this.f239125a = j10;
                }
                if (i11 > this.f239126b.available()) {
                    i11 = this.f239126b.available();
                }
                int i12 = this.f239126b.read(bArr, i10, i11);
                if (i12 >= 0) {
                    this.f239125a += (long) i12;
                    return i12;
                }
            } catch (IOException unused) {
            }
            this.f239125a = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    public b(@NonNull InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(@androidx.annotation.NonNull java.io.InputStream r4, int r5) throws java.io.IOException {
        /*
            r3 = this;
            r3.<init>()
            t1.b$f[][] r0 = t1.b.f238922d7
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r3.f239109f = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r3.f239110g = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r3.f239111h = r0
            if (r4 == 0) goto L6a
            r0 = 0
            r3.f239104a = r0
            r1 = 1
            if (r5 != r1) goto L3c
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream
            byte[] r2 = t1.b.f238978k7
            int r2 = r2.length
            r5.<init>(r4, r2)
            boolean r4 = P(r5)
            if (r4 != 0) goto L34
            java.lang.String r4 = "ExifInterface"
            java.lang.String r5 = "Given data does not follow the structure of an Exif-only data."
            android.util.Log.w(r4, r5)
            return
        L34:
            r3.f239108e = r1
            r3.f239106c = r0
            r3.f239105b = r0
            r4 = r5
            goto L66
        L3c:
            boolean r5 = r4 instanceof android.content.res.AssetManager.AssetInputStream
            if (r5 == 0) goto L48
            r5 = r4
            android.content.res.AssetManager$AssetInputStream r5 = (android.content.res.AssetManager.AssetInputStream) r5
            r3.f239106c = r5
            r3.f239105b = r0
            goto L66
        L48:
            boolean r5 = r4 instanceof java.io.FileInputStream
            if (r5 == 0) goto L62
            r5 = r4
            java.io.FileInputStream r5 = (java.io.FileInputStream) r5
            java.io.FileDescriptor r1 = r5.getFD()
            boolean r1 = X(r1)
            if (r1 == 0) goto L62
            r3.f239106c = r0
            java.io.FileDescriptor r5 = r5.getFD()
            r3.f239105b = r5
            goto L66
        L62:
            r3.f239106c = r0
            r3.f239105b = r0
        L66:
            r3.e0(r4)
            return
        L6a:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "inputStream cannot be null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.b.<init>(java.io.InputStream, int):void");
    }
}
