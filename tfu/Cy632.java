/*
 * Decompiled with CFR 0.146.
 */
package tfu;

import tfu.Cg550;

class Cy632 {
    private static final int[] d = new int[]{256, 128, 86, 64};
    private static final boolean g = true;
    private static final float[] q = new float[]{1.0649863E-7f, 1.1341951E-7f, 1.2079015E-7f, 1.2863978E-7f, 1.369995E-7f, 1.459025E-7f, 1.5538409E-7f, 1.6548181E-7f, 1.7623574E-7f, 1.8768856E-7f, 1.998856E-7f, 2.128753E-7f, 2.2670913E-7f, 2.4144197E-7f, 2.5713223E-7f, 2.7384212E-7f, 2.9163792E-7f, 3.1059022E-7f, 3.307741E-7f, 3.5226967E-7f, 3.7516213E-7f, 3.995423E-7f, 4.255068E-7f, 4.5315863E-7f, 4.8260745E-7f, 5.1397E-7f, 5.4737063E-7f, 5.829419E-7f, 6.208247E-7f, 6.611694E-7f, 7.041359E-7f, 7.4989464E-7f, 7.98627E-7f, 8.505263E-7f, 9.057983E-7f, 9.646621E-7f, 1.0273513E-6f, 1.0941144E-6f, 1.1652161E-6f, 1.2409384E-6f, 1.3215816E-6f, 1.4074654E-6f, 1.4989305E-6f, 1.5963394E-6f, 1.7000785E-6f, 1.8105592E-6f, 1.9282195E-6f, 2.053526E-6f, 2.1869757E-6f, 2.3290977E-6f, 2.4804558E-6f, 2.6416496E-6f, 2.813319E-6f, 2.9961443E-6f, 3.1908505E-6f, 3.39821E-6f, 3.619045E-6f, 3.8542307E-6f, 4.1047006E-6f, 4.371447E-6f, 4.6555283E-6f, 4.958071E-6f, 5.280274E-6f, 5.623416E-6f, 5.988857E-6f, 6.3780467E-6f, 6.7925284E-6f, 7.2339453E-6f, 7.704048E-6f, 8.2047E-6f, 8.737888E-6f, 9.305725E-6f, 9.910464E-6f, 1.0554501E-5f, 1.1240392E-5f, 1.1970856E-5f, 1.2748789E-5f, 1.3577278E-5f, 1.4459606E-5f, 1.5399271E-5f, 1.6400005E-5f, 1.7465769E-5f, 1.8600793E-5f, 1.9809577E-5f, 2.1096914E-5f, 2.2467912E-5f, 2.3928002E-5f, 2.5482977E-5f, 2.7139005E-5f, 2.890265E-5f, 3.078091E-5f, 3.2781227E-5f, 3.4911533E-5f, 3.718028E-5f, 3.9596467E-5f, 4.2169668E-5f, 4.491009E-5f, 4.7828602E-5f, 5.0936775E-5f, 5.424693E-5f, 5.7772202E-5f, 6.152657E-5f, 6.552491E-5f, 6.9783084E-5f, 7.4317984E-5f, 7.914758E-5f, 8.429104E-5f, 8.976875E-5f, 9.560242E-5f, 1.0181521E-4f, 1.0843174E-4f, 1.1547824E-4f, 1.2298267E-4f, 1.3097477E-4f, 1.3948625E-4f, 1.4855085E-4f, 1.5820454E-4f, 1.6848555E-4f, 1.7943469E-4f, 1.9109536E-4f, 2.0351382E-4f, 2.167393E-4f, 2.3082423E-4f, 2.4582449E-4f, 2.6179955E-4f, 2.7881275E-4f, 2.9693157E-4f, 3.1622787E-4f, 3.3677815E-4f, 3.5866388E-4f, 3.8197188E-4f, 4.0679457E-4f, 4.3323037E-4f, 4.613841E-4f, 4.913675E-4f, 5.2329927E-4f, 5.573062E-4f, 5.935231E-4f, 6.320936E-4f, 6.731706E-4f, 7.16917E-4f, 7.635063E-4f, 8.1312325E-4f, 8.6596457E-4f, 9.2223985E-4f, 9.821722E-4f, 0.0010459992f, 0.0011139743f, 0.0011863665f, 0.0012634633f, 0.0013455702f, 0.0014330129f, 0.0015261382f, 0.0016253153f, 0.0017309374f, 0.0018434235f, 0.0019632196f, 0.0020908006f, 0.0022266726f, 0.0023713743f, 0.0025254795f, 0.0026895993f, 0.0028643848f, 0.0030505287f, 0.003248769f, 0.0034598925f, 0.0036847359f, 0.0039241905f, 0.0041792067f, 0.004450795f, 0.004740033f, 0.005048067f, 0.0053761187f, 0.005725489f, 0.0060975635f, 0.0064938175f, 0.0069158226f, 0.0073652514f, 0.007843887f, 0.008353627f, 0.008896492f, 0.009474637f, 0.010090352f, 0.01074608f, 0.011444421f, 0.012188144f, 0.012980198f, 0.013823725f, 0.014722068f, 0.015678791f, 0.016697686f, 0.017782796f, 0.018938422f, 0.020169148f, 0.021479854f, 0.022875736f, 0.02436233f, 0.025945531f, 0.027631618f, 0.029427277f, 0.031339627f, 0.03337625f, 0.035545226f, 0.037855156f, 0.0403152f, 0.042935107f, 0.045725275f, 0.048696756f, 0.05186135f, 0.05523159f, 0.05882085f, 0.062643364f, 0.06671428f, 0.07104975f, 0.075666964f, 0.08058423f, 0.08582105f, 0.09139818f, 0.097337745f, 0.1036633f, 0.11039993f, 0.11757434f, 0.12521498f, 0.13335215f, 0.14201812f, 0.15124726f, 0.16107617f, 0.1715438f, 0.18269168f, 0.19456401f, 0.20720787f, 0.22067343f, 0.23501402f, 0.25028655f, 0.26655158f, 0.28387362f, 0.3023213f, 0.32196787f, 0.34289113f, 0.36517414f, 0.3889052f, 0.41417846f, 0.44109413f, 0.4697589f, 0.50028646f, 0.53279793f, 0.5674221f, 0.6042964f, 0.64356697f, 0.6853896f, 0.72993004f, 0.777365f, 0.8278826f, 0.88168305f, 0.9389798f, 1.0f};
    private static int[] r;
    private static int[] v;
    private static boolean[] y;
    int[] b;
    private int e;
    int[] h;
    private int[] j;
    int[] l;
    int[] s;
    int[][] w;

    Cy632() {
        int n;
        int n2;
        int n3;
        int n4;
        int n5 = Cg550.j(16);
        if (n5 != 1) {
            throw new RuntimeException("Unsupported floor type " + n5);
        }
        int n6 = Cg550.j(5);
        int n7 = 0;
        this.h = new int[n6];
        for (n = 0; n < n6; ++n) {
            this.h[n] = n4 = Cg550.j(4);
            if (n4 < n7) continue;
            n7 = n4 + 1;
        }
        this.s = new int[n7];
        this.b = new int[n7];
        this.l = new int[n7];
        this.w = new int[n7][];
        for (n = 0; n < n7; ++n) {
            this.s[n] = Cg550.j(3) + 1;
            this.b[n] = Cg550.j(2);
            n4 = this.b[n];
            if (n4 != 0) {
                this.l[n] = Cg550.j(8);
            }
            n4 = 1 << n4;
            int[] arrn = new int[n4];
            this.w[n] = arrn;
            for (n3 = 0; n3 < n4; ++n3) {
                arrn[n3] = Cg550.j(8) - 1;
            }
        }
        this.e = Cg550.j(2) + 1;
        n = Cg550.j(4);
        n4 = 2;
        for (n2 = 0; n2 < n6; ++n2) {
            n4 += this.s[this.h[n2]];
        }
        this.j = new int[n4];
        this.j[0] = 0;
        this.j[1] = 1 << n;
        n4 = 2;
        for (n2 = 0; n2 < n6; ++n2) {
            n3 = this.h[n2];
            for (int i = 0; i < this.s[n3]; ++i) {
                this.j[n4++] = Cg550.j(n);
            }
        }
        if (r == null || r.length < n4) {
            r = new int[n4];
            v = new int[n4];
            y = new boolean[n4];
        }
    }

    private static void g(Cy632 cy632, int n, int n2) {
        if (n >= n2) {
            return;
        }
        int n3 = n;
        int n4 = r[n3];
        int n5 = v[n3];
        boolean bl = y[n3];
        for (int i = n + 1; i <= n2; ++i) {
            int n6 = r[i];
            if (n6 >= n4) continue;
            Cy632.r[n3] = n6;
            Cy632.v[n3] = v[i];
            Cy632.y[n3] = y[i];
            Cy632.r[i] = r[++n3];
            Cy632.v[i] = v[n3];
            Cy632.y[i] = y[n3];
        }
        Cy632.r[n3] = n4;
        Cy632.v[n3] = n5;
        Cy632.y[n3] = bl;
        Cy632.g(cy632, n, n3 - 1);
        Cy632.g(cy632, n3 + 1, n2);
    }
}

