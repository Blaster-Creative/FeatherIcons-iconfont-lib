package il.co.blaster.feathericonslibsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import il.co.blaster.feathericonslib.FeatherIcons
import kotlinx.android.synthetic.main.activity_second.*
import kotlin.random.Random


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val items = listOf(
            FeatherIcons.feather_shopping_cart.glyph to "Shopping cart",
            FeatherIcons.feather_book_open.glyph to "My books",
            FeatherIcons.feather_pie_chart.glyph to "My stats",
            FeatherIcons.feather_film.glyph to "Movies to watch",
            FeatherIcons.feather_feather.glyph to "Feather is cool"
        )

        list?.apply {
            layoutManager = LinearLayoutManager(this@SecondActivity)
            adapter = Adapter(items)
        }

        showcase?.apply {
            text = randomGlyph()
            setOnClickListener {
                text = randomGlyph()
            }
        }
    }

    class Adapter(private val items: List<Pair<String, String>>) :
        RecyclerView.Adapter<Adapter.ViewHolder>() {
        override fun getItemCount(): Int = items.size
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
            return ViewHolder(v)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.apply {
                tIcon?.text = items[position].first
                tText?.text = items[position].second
            }
        }

        class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
            val tIcon: TextView? = v.findViewById(R.id.t_icon)
            val tText: TextView? = v.findViewById(R.id.t_text)
        }
    }

    private fun randomGlyph(): String {
        val a = FeatherIcons.values()
        return a[Random.nextInt(a.size)].glyph
    }
}
