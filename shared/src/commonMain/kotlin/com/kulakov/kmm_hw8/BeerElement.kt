package com.kulakov.kmm_hw8

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BeerElement (
    val id: Long?,
    val name: String,
    val description: String,
    @SerialName("image_url") val imageURL: String,
    val ibu: Double? = null
    //  val tagline: String?

//    @SerialName("first_brewed")
//    val firstBrewed: String,
//
//
//
//    @SerialName("image_url")
//    val imageURL: String,
//
//    val abv: Double,
//    val ibu: Double? = null,
//
//    @SerialName("target_fg")
//    val targetFg: Long,
//
//    @SerialName("target_og")
//    val targetOg: Double,
//
//    val ebc: Long? = null,
//    val srm: Double? = null,
//    val ph: Double? = null,
//
//    @SerialName("attenuation_level")
//    val attenuationLevel: Double,
//
////    val volume: BoilVolume,
////
////    @SerialName("boil_volume")
////    val boilVolume: BoilVolume,
////
////    val method: Method,
////    val ingredients: Ingredients,
//
//    @SerialName("food_pairing")
//    val foodPairing: List<String>,
//
//    @SerialName("brewers_tips")
//    val brewersTips: String,

//    @SerialName("contributed_by")
//    val contributedBy: ContributedBy
)
//
//@Serializable
//data class BoilVolume (
//    val value: Double,
//    val unit: Unit
//)
//
//@Serializable
//enum class Unit(val value: String) {
//    @SerialName("celsius") Celsius("celsius"),
//    @SerialName("grams") Grams("grams"),
//    @SerialName("kilograms") Kilograms("kilograms"),
//    @SerialName("litres") Litres("litres");
//}
//
//@Serializable
//enum class ContributedBy(val value: String) {
//    @SerialName("Ali Skinner <AliSkinner>") AliSkinnerAliSkinner("Ali Skinner <AliSkinner>"),
//    @SerialName("Sam Mason <samjbmason>") SamMasonSamjbmason("Sam Mason <samjbmason>");
//}
//
//@Serializable
//data class Ingredients (
//    val malt: List<Malt>,
//    val hops: List<Hop>,
//    val yeast: String
//)
//
//@Serializable
//data class Hop (
//    val name: String,
//    val amount: BoilVolume,
//    val add: Add,
//    val attribute: Attribute
//)
//
//@Serializable
//enum class Add(val value: String) {
//    @SerialName("dry hop") DryHop("dry hop"),
//    @SerialName("end") End("end"),
//    @SerialName("middle") Middle("middle"),
//    @SerialName("start") Start("start");
//}
//
//@Serializable
//enum class Attribute(val value: String) {
//    @SerialName("aroma") Aroma("aroma"),
//    @SerialName("Flavour") AttributeFlavour("Flavour"),
//    @SerialName("bitter") Bitter("bitter"),
//    @SerialName("flavour") Flavour("flavour");
//}
//
//@Serializable
//data class Malt (
//    val name: String,
//    val amount: BoilVolume
//)
//
//@Serializable
//data class Method (
//    @SerialName("mash_temp")
//    val mashTemp: List<MashTemp>,
//
//    val fermentation: Fermentation,
//    val twist: String? = null
//)
//
//@Serializable
//data class Fermentation (
//    val temp: BoilVolume
//)
//
//@Serializable
//data class MashTemp (
//    val temp: BoilVolume,
//    val duration: Long? = null
//)
