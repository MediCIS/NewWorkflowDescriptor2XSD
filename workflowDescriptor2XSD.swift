#!/usr/bin/swift
//
//  workflowDescriptor2XSD.swift
//  Created by Marine Brenet on 02/11/2018.
//

import Foundation

let path = "calibrationWorkflow.txt"

do {
    // Read an entire text file into an NSString.
    let contents:NSString
    contents = try NSString(contentsOfFile: path, encoding: String.Encoding.ascii.rawValue)
    
    // Print all lines.
    //contents.enumerateLines({ (line, stop) -> () in print("Line = \(line)")})
    let enumLine = contents.enumerateLines()
    
}
