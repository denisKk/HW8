//
//  AsyncImageView.swift
//  punkIosApp
//
//  Created by Dev on 1.03.24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI

struct AsyncImageView: View {
    let url: URL

    var body: some View {
        AsyncImage(
            url: url,
            transaction: Transaction(animation: .easeInOut)
        ) { phase in
            switch phase {
            case .empty:
                ProgressView()
            case .success(let image):
                image
                    .resizable()
                    .scaledToFit()
                    .transition(.scale(scale: 0.1, anchor: .center))
            case .failure:
                Image(systemName: "wifi.slash")
            @unknown default:
                EmptyView()
            }
        }
        .frame(width: 80, height: 160)
        .clipShape(RoundedRectangle(cornerRadius: 4))
    }
}
