package com.example.exbinar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.exbinar.databinding.ActivityMainBinding


open class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvVS.text = getString(R.string.vs)

        binding.ivPemain1Batu.setOnClickListener {
            Pilihanplayer()
            Pilihanplayer.coba.hasilnya = ("0")
            val com = arrayListOf("0", "1", "2")
            Pilihanplayer.coba.pilihancom = com.random()
            binding.ivPemain1Kertas.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.white
                )
            )
            binding.ivPemain1Gunting.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.white
                )
            )
            binding.ivPemain1Batu.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.shadow

                )
            )
            binding.ivPemain1Batu.setBackgroundResource(R.drawable.bg_rounded)
            when (Pilihanplayer.coba.pilihancom) {
                "0" -> {
                    binding.tvHasilnotdraw.text = getString(R.string.hasildraw)
                    binding.tvHasilnotdraw.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.blue
                        )
                    )

                    binding.ivComBatu.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.shadow
                        )
                    )
                    binding.ivComBatu.setBackgroundResource(R.drawable.bg_rounded)
                    binding.ivComKertas.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.white
                        )
                    )
                    binding.ivComGunting.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.white
                        )
                    )
                }
                "1" -> {
                    binding.tvHasilnotdraw.text = getString(R.string.p2menang)
                    binding.tvHasilnotdraw.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.green
                        )
                    )
                    binding.ivComKertas.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.shadow
                        )
                    )
                    binding.ivComKertas.setBackgroundResource(R.drawable.bg_rounded)
                    binding.ivComBatu.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.white
                        )
                    )
                    binding.ivComGunting.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.white
                        )
                    )
                }
                "2" -> {
                    binding.tvHasilnotdraw.text = getString(R.string.p1menang)
                    binding.tvHasilnotdraw.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.green
                        )
                    )
                    binding.ivComGunting.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.shadow
                        )
                    )
                    binding.ivComGunting.setBackgroundResource(R.drawable.bg_rounded)
                    binding.ivComBatu.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.white
                        )
                    )
                    binding.ivComKertas.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.white
                        )
                    )
                }
            }
        }

        binding.ivPemain1Kertas.setOnClickListener {
            Pilihanplayer()
            Pilihanplayer.coba.hasilnya = ("1")
            val com = arrayListOf("0", "1", "2")
            Pilihanplayer.coba.pilihancom = com.random()
            binding.ivPemain1Batu.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.white
                )
            )
            binding.ivPemain1Gunting.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.white
                )
            )
            binding.ivPemain1Kertas.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.shadow
                )
            )
            binding.ivPemain1Kertas.setBackgroundResource(R.drawable.bg_rounded)
            when (Pilihanplayer.coba.pilihancom) {
                "1" -> {
                    binding.tvHasilnotdraw.text = getString(R.string.hasildraw)
                    binding.tvHasilnotdraw.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.blue
                        )
                    )

                    binding.ivComKertas.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.shadow
                        )
                    )
                    binding.ivComKertas.setBackgroundResource(R.drawable.bg_rounded)
                    binding.ivComBatu.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.white
                        )
                    )
                    binding.ivComGunting.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.white
                        )
                    )
                }
                "2" -> {
                    binding.tvHasilnotdraw.text = getString(R.string.p2menang)
                    binding.tvHasilnotdraw.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.green
                        )
                    )
                    binding.ivComGunting.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.shadow
                        )
                    )
                    binding.ivComGunting.setBackgroundResource(R.drawable.bg_rounded)
                    binding.ivComBatu.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.white
                        )
                    )
                    binding.ivComKertas.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.white
                        )
                    )
                }
                "0" -> {
                    binding.tvHasilnotdraw.text = getString(R.string.p1menang)
                    binding.tvHasilnotdraw.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.green
                        )
                    )
                    binding.ivComBatu.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.shadow
                        )
                    )
                    binding.ivComBatu.setBackgroundResource(R.drawable.bg_rounded)
                    binding.ivComGunting.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.white
                        )
                    )
                    binding.ivComKertas.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.white
                        )
                    )
                }
            }
        }

        binding.ivPemain1Gunting.setOnClickListener {
            Pilihanplayer()
            Pilihanplayer.coba.hasilnya = ("2")
            val com = arrayListOf("0", "1", "2")
            Pilihanplayer.coba.pilihancom = com.random()
            binding.ivPemain1Batu.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.white
                )
            )
            binding.ivPemain1Kertas.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.white
                )
            )
            binding.ivPemain1Gunting.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.shadow
                )
            )
            binding.ivPemain1Gunting.setBackgroundResource(R.drawable.bg_rounded)
            when (Pilihanplayer.coba.pilihancom) {
                "2" -> {
                    binding.tvHasilnotdraw.text = getString(R.string.hasildraw)
                    binding.tvHasilnotdraw.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.blue
                        )
                    )

                    binding.ivComGunting.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.shadow
                        )
                    )
                    binding.ivComGunting.setBackgroundResource(R.drawable.bg_rounded)
                    binding.ivComBatu.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.white
                        )
                    )
                    binding.ivComKertas.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.white
                        )
                    )
                }
                "0" -> {
                    binding.tvHasilnotdraw.text = getString(R.string.p2menang)
                    binding.tvHasilnotdraw.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.green
                        )
                    )
                    binding.ivComBatu.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.shadow
                        )
                    )
                    binding.ivComBatu.setBackgroundResource(R.drawable.bg_rounded)
                    binding.ivComGunting.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.white
                        )
                    )
                    binding.ivComKertas.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.white
                        )
                    )
                }
                "1" -> {
                    binding.tvHasilnotdraw.text = getString(R.string.p1menang)
                    binding.tvHasilnotdraw.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.green
                        )
                    )
                    binding.ivComKertas.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.shadow
                        )
                    )
                    binding.ivComKertas.setBackgroundResource(R.drawable.bg_rounded)
                    binding.ivComGunting.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.white
                        )
                    )
                    binding.ivComBatu.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.white
                        )
                    )


                }
            }
        }

        binding.Refresh.setOnClickListener {
            binding.ivComKertas.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.none
                )
            )
            binding.ivComBatu.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.none
                )
            )
            binding.ivComGunting.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.none
                )
            )
            binding.ivPemain1Gunting.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.none
                )
            )
            binding.ivPemain1Kertas.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.none
                )
            )
            binding.ivPemain1Batu.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.none
                )
            )
            binding.tvHasilnotdraw.text = ""
            binding.tvHasilnotdraw.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.none
                )
            )
            binding.tvVS.text = getString(R.string.vs)
            binding.tvVS.setTextColor(
                ContextCompat.getColor(
                    this,
                    R.color.red
                )
            )
        }
    }
}


