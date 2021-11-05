package id.ac.persiapan_uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.akutansi,"AKUTANSI","AKUTANSI","Teknik Kendaraan Ringan Otomotif " +
                "adalah sebuah ilmu yang mempelajari kompetisi keahlian bidang teknik otomotif yang menekankan pada bidang jasa perbaikan kendaraan ringan (mobil). " +
                "SMK 3 TEGAL"))

        data?.add(DataModel(R.drawable.av,"AV","AUDIO VIDEO", "TKJ (Teknik Komputer dan Jaringan) adalah " +
                "ilmu berbasis Teknologi Informasi dan Komunikasi terkait kemampuan algoritma, dan pemrograman komputer, perakitan komputer,  " +
                "perakitan jaringan komputer, dan pengoperasian perangkat lunak, dan internet. Teknik komputer, dan jaringan"))

        data?.add(DataModel(R.drawable.managemen,"MANAGEMEN","MANAJEMEN", "Pizza asli berasal dari Italia " +
                "dan bisa ditemui di Pizzeria (toko Pizza) yang tiap porsi pizzanya berdiameter kira-kira 30 cm atau lebih, " +
                "dengan adonan yang telah ditarik tipis."))

        data?.add(DataModel(R.drawable.mm,"MM","MULTI MEDIA", "Ini adalah makanan pokok dalam " +
                "masakan Italia tradisional. Karena berbentuk seperti mie, kebanyakan orang menyebutnya mie dari Italia meskipun " +
                "banyak varian pasta lainnya yang berbentuk seperti mie"))

        data?.add(DataModel(R.drawable.pemasaran,"PEMASARAN","PEMASARAN", "Martabak manis atau yang aslinya bernama " +
                "Hok Lo Pan awalnya adalah makanan khas Bangka Belitung. Hok Lo Pan atau Martabak diciptakan oleh orang-orang Hakka (Khek) " +
                "Bangka"))

        data?.add(DataModel(R.drawable.tkj,"TKJ","TEKNIK KOMPUTER JARINGAN", "Pizza asli berasal dari Italia " +
                "dan bisa ditemui di Pizzeria (toko Pizza) yang tiap porsi pizzanya berdiameter kira-kira 30 cm atau lebih, " +
                "dengan adonan yang telah ditarik tipis."))

        data?.add(DataModel(R.drawable.tb,"TB","TATA BOGA", "Ini adalah makanan pokok dalam " +
                "masakan Italia tradisional. Karena berbentuk seperti mie, kebanyakan orang menyebutnya mie dari Italia meskipun " +
                "banyak varian pasta lainnya yang berbentuk seperti mie"))


        data?.add(DataModel(R.drawable.kecantikan,"KECANTIKAN","TEKNIK PENANGKAP IKAN", "Martabak manis atau yang aslinya bernama " +
                "Hok Lo Pan awalnya adalah makanan khas Bangka Belitung. Hok Lo Pan atau Martabak diciptakan oleh orang-orang Hakka (Khek) " +
                "Bangka"))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.jurusan)
                intent.putExtra("harga", item?.nama_jurusan)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }
        })
    }
}