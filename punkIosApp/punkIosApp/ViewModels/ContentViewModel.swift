//
//  ContentViewModel.swift
//  punkIosApp
//
//  Created by Dev on 29.02.24.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import shared

final class ContentViewModel: ObservableObject {
    
    private let network = NetworkService()
    
    @Published var beers: [BeerElement] = .init()
    
    init() {
        network.feach() { [weak self] result, error in
            if let error = error {
                print(error.localizedDescription)
                return
            } else {
                DispatchQueue.main.async {
                    self?.beers = result ?? []
                }
            }
        }
    }
}
