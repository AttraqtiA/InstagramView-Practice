package com.example.week4lab_0706012210011.ui.theme.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week4lab_0706012210011.R
import com.example.week4lab_0706012210011.data.dummy_data
import com.example.week4lab_0706012210011.model.categories
import com.example.week4lab_0706012210011.model.products
import java.text.DecimalFormat

@Composable
fun MarketView(CategoriesList: List<categories>, ProductList: List<products>) {
    Column(
        modifier = Modifier.padding(top = 24.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 24.dp, end = 24.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Tokopedia",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
            )
            IconButton(
                onClick = { /* TODO */ }
            ) {
                Icon(
                    imageVector = Icons.Filled.MoreVert,
                    contentDescription = "More Button",
                )
            }
        }

        Image(
            painter = painterResource(id = R.drawable.banner_tokopedia),
            contentDescription = "Banner Tokopedia",
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 24.dp, end = 24.dp),
        )

        Text(
            text = "Categories",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 8.dp, start = 24.dp, end = 24.dp)
        )

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            items(CategoriesList) {
                CategoriesCard(
                    it
                )
            }
        }

        Text(
            text = "Products",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 8.dp, start = 24.dp, end = 24.dp)
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.padding(start = 24.dp, end = 24.dp)
        ) {
            items(ProductList) {
                ProductCard(
                    it
                )
            }
        }
    }
}

@Composable
fun CategoriesCard(Categories: categories) {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(8.dp),
        shape = MaterialTheme.shapes.small,
        colors = CardDefaults.cardColors(Color.White)
        //kalau berubah lightgray, perlu ditreat dengan card default
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = Categories.image_path),
                contentDescription = "The Image",
                modifier = Modifier
                    .size(100.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = Categories.category_name,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Text(
                text = "${Categories.number_of_items} products",
                fontSize = 14.sp
            )
        }
    }
}

@Composable
fun ProductCard(Products: products) {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(8.dp),
        shape = MaterialTheme.shapes.small,
        colors = CardDefaults.cardColors(Color.White)
        //kalau berubah lightgray, perlu ditreat dengan card default
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = Products.image_path),
                    contentDescription = "The Image",
                    modifier = Modifier
                        .size(125.dp),
                    contentScale = ContentScale.Crop
                )
            }
            Text(
                text = Products.product_name,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Text(
                text = "Rp. ${DecimalFormat("#,###").format(Products.price)}",
                fontSize = 14.sp
            )
            Text(
                text = "Kota ${Products.location}",
                fontSize = 14.sp
            )
            Text(
                text = "${Products.sold} Sold",
                fontSize = 14.sp
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MarketPreview() {
    MarketView(
        CategoriesList = dummy_data().get_data_tokopedia_category(),
        ProductList = dummy_data().get_data_tokopedia_product()
    )
}