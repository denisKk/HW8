//
//  BeerCeelView.swift
//  punkIosApp
//
//  Created by Dev on 1.03.24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI
import shared

struct BeerCeelView: View {
    
    let beer: BeerElement
    
    var body: some View {
        VStack {
            HStack(alignment: .top) {
                AsyncImageView(url: URL(string: beer.imageURL)!)
                
                VStack(alignment: .leading) {
                    Text(beer.name)
                        .font(.title)
                    Text("ibu: \(beer.ibu ?? 0)")
                        .bold()
                    Text(beer.description_)
                        .font(.footnote)
                }
                .frame(maxWidth: .infinity, alignment: .topLeading)
            }
                
        }
        .padding()
    }
}



#Preview {
    BeerCeelView(beer: BeerElement.mocData)
}

extension BeerElement {
    static var mocData: BeerElement {
        BeerElement(id: 1,
                    name: "Punk IPA",
                    description: "Craft beer",
                    imageURL: "https://images.punkapi.com/v2/22.png",
                    ibu: 5.2
                    )
    }
}
